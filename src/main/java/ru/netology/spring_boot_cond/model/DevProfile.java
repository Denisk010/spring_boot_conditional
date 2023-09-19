package ru.netology.spring_boot_cond.model;

import ru.netology.spring_boot_cond.model.SystemProfile;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is DEV. Because profile.dev = true";
    }
}
