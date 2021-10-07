package ru.netology.Conditional;

import ru.netology.Interface.SystemProfile;

public class DevProfile implements SystemProfile {

    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}
