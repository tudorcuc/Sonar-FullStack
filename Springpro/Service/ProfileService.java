package com.Springpro.Springpro.Service;

import com.Springpro.Springpro.Entity.Profile;
import com.Springpro.Springpro.Observer.ProfileObserver;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The ProfileService interface defines operations for managing Profile entities.
 */
@Service
public interface ProfileService {

    /**
     * Creates a new profile.
     *
     * @param profile The profile to be created.
     * @return The created profile.
     */
    Profile createProfile(Profile profile);

    /**
     * Retrieves a profile by its ID.
     *
     * @param profileId The ID of the profile to retrieve.
     * @return The profile with the specified ID, or null if not found.
     */
    Profile getProfileById(int profileId);

    /**
     * Retrieves all profiles.
     *
     * @return A list of all profiles.
     */
    List<Profile> getAllProfiles();

    /**
     * Updates an existing profile.
     *
     * @param profile The profile to be updated.
     * @return The updated profile.
     */
    Profile updateProfile(Profile profile);

    /**
     * Deletes a profile by its ID.
     *
     * @param profileId The ID of the profile to delete.
     */
    void deleteProfile(int profileId);

    /**
     * Adds an observer to the list of observers.
     *
     * @param observer The observer to be added.
     */
    void addObserver(ProfileObserver observer);

    /**
     * Removes an observer from the list of observers.
     *
     * @param observer The observer to be removed.
     */
    void removeObserver(ProfileObserver observer);

    /**
     * Notifies all observers with the updated profile.
     *
     * @param profile The profile that has been updated.
     */
    void notifyObservers(Profile profile);

    Profile login(String username, String password);
}
