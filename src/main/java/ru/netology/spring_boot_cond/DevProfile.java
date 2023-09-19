package ru.netology.spring_boot_cond;

public class DevProfile implements SystemProfile{
    @Override
    public String getProfile() {
        return "Current profile is DEV. Because rofile.dev = true";
    }
}
