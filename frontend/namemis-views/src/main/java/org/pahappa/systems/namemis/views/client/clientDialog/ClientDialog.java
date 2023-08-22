package org.pahappa.systems.namemis.views.client.clientDialog;

import org.pahappa.systems.namemis.core.services.Clientservice;
import org.pahappa.systems.namemis.models.customer.Client;
import org.pahappa.systems.namemis.security.HyperLinks;
import org.pahappa.systems.namemis.views.dialogs.DialogForm;
import org.sers.webutils.server.core.utils.ApplicationContextProvider;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="clientDialog")
@SessionScoped
public class ClientDialog extends DialogForm<Client> {
  private Clientservice clientService;

  @PostConstruct
  public void init(){
      this.clientService= ApplicationContextProvider.getBean(Clientservice.class);
  }
    public ClientDialog() {
        super(HyperLinks.NAME_DIALOG, 700, 300);
    }


    @Override
    public void persist() throws Exception {
        this.clientService.saveInstance(super.model);

    }
    @Override
    public void resetModal(){
      super.resetModal();
      super.model=new Client();
    }
}
