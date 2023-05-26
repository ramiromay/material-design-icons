package com.realssoft.materialdesign;

public enum MicrosoftSegoeIcon implements IconCode
{

    PHOTO('\ue91b'),
    CHROME_MINIMIZE('\ue921'),
    CHROME_MAXIMIZE('\ue922'),
    CHROME_RESTORE('\uE923'),
    CHROME_CLOSE('\ue8bb'),
    HOME_SOLID('\uea8a'),
    INFO_SOLID('\uf167'),
    CONTACT_SOLID('\uea8c'),
    ADD('\ue710'),
    PLAY_SOLID('\uf5b0'),
    OPEN_LOCAL('\ue8da'),
    CHROME_BACK('\ue830'),
    ALL_APP('\ue71d'),
    SHOW_BCC('\ue8c4'),
    HIDE_BCC('\ue8c5'),
    CIRCLE_FILL('\uea3b'),
    TRACKERS('\ueadf'),
    DIAGNOSTIC('\ue9d9'),
    CLEAR_ALL_INK('\ued62'),
    COMPANION_DEVICE_FRAMEWORK('\ued5d'),
    SAVE('\ue74e');

    private final char character;

    MicrosoftSegoeIcon(char character)
    {
        this.character = character;
    }

    @Override
    public char getUnicode()
    {
        return character;
    }

    @Override
    public String getFontFamily()
    {
        return "Microsoft Icons";
    }

}