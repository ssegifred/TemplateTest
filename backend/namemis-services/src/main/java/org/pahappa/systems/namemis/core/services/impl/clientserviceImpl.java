package org.pahappa.systems.namemis.core.services.impl;

import org.pahappa.systems.namemis.core.services.Clientservice;
import org.pahappa.systems.namemis.core.services.impl.GenericServiceImpl;
import org.pahappa.systems.namemis.models.customer.Client;
import org.pahappa.systems.namemis.utils.Validate;
import org.sers.webutils.model.exception.OperationFailedException;
import org.sers.webutils.model.exception.ValidationFailedException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class clientserviceImpl extends GenericServiceImpl<Client> implements Clientservice {

    @Override
    public boolean isDeletable(Client instance) throws OperationFailedException {
        return true;
    }

    @Override
    public Client saveInstance(Client entityInstance) throws ValidationFailedException, OperationFailedException {
        Validate.notNull(entityInstance,"Entity attributes are required");
        return save(entityInstance);
    }
}
