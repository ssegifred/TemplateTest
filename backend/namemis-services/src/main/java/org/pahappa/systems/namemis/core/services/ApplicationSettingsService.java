package org.pahappa.systems.namemis.core.services;

import org.pahappa.systems.namemis.models.settings.ApplicationSettings;

/**
 * Responsible for CRUD operations on {@link ApplicationSettings}
 */
public interface ApplicationSettingsService extends GenericService<ApplicationSettings> {
    /**
     * Gets {@link ApplicationSettings}
     *
     * @return
     */
    ApplicationSettings getActiveApplicationSettings();
}
