package ru.netology.spring_boot_cond;

public class ProductionProfile implements SystemProfile{
    @Override
    public String getProfile() {
        return "Current profile is production. Because profile.dev = false";
    }
}
