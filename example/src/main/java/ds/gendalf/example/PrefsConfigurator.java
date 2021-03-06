package ds.gendalf.example;


import java.util.*;

import ds.gendalf.CustomPref;
import ds.gendalf.PrefsConfig;
import ds.gendalf.example.converter.*;
import ds.gendalf.example.data.Direction;
import ds.gendalf.example.data.Guitar;

@PrefsConfig("AppPrefs")
interface AppPrefsConfigurator {
    String version = null;
    String os = null;
    String PREF_SECRET = "12345678";
    @CustomPref(StringListConverter.class) List<String> names = null;   // default value for complex objects is not supported
    @CustomPref(CustomEnumConverter.class) List<Direction> directions = null;
    @CustomPref(GsonConverter.class) Guitar guitar = null;
    @CustomPref(GsonConverter.class) List<String> colors = null;
}

@PrefsConfig("UserPrefs")
interface UserPrefsConfigurator {
    String city = "Kharkiv";
    String userName = null;
    int age = 18;
    int KEY_RATE = 0;
    int ID = -1;
    boolean admin = true;
    float length = 20.5f;
    long time = 0;
    long phone = 380951234567L;
    Set<String> friends = null;
}
