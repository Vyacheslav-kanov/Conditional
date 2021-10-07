package ru.netology.Conditional;

import ru.netology.Interface.SystemProfile;

public class ProductionProfile implements SystemProfile {

    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}
