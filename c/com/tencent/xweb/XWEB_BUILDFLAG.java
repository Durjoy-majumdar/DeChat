package com.tencent.xweb;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class XWEB_BUILDFLAG {
    public static final boolean XWEB_ACTIVITY_BIND = true;
    public static final boolean XWEB_AUDIO_AUTOPLAY_FLAG = true;
    public static final boolean XWEB_BACKGROUND_AUDIO_PAUSE = true;
    public static final boolean XWEB_COMMON = true;
    public static final boolean XWEB_CREATE_CLOSE_WINDOW = true;
    public static final boolean XWEB_CUSTOM_FULLSCREEN = true;
    public static final boolean XWEB_DARK_MODE = true;
    public static final boolean XWEB_FORCE_WAITING_SWAP = true;
    public static final boolean XWEB_IMAGE_TO_FILE = true;
    public static final boolean XWEB_INPUT = true;
    public static final boolean XWEB_JAVASCRIPT_CAN_ACCESS_CLIPBOARD = true;
    public static final boolean XWEB_KEEP_INPUT_OUT_OF_KEYBOARD = true;
    public static final boolean XWEB_LONG_PRESS_TIME_CUSTOMIZE = true;
    public static final boolean XWEB_QUIC = true;
    public static final boolean XWEB_RECOVER_VSYNC_CALLBACK = true;
    public static final boolean XWEB_SAME_LAYER = true;
    public static final boolean XWEB_SCROLLBAR = true;
    public static final boolean XWEB_SEARCH = true;
    public static final boolean XWEB_SET_BOTTOM_HEIGHT = true;
    public static final boolean XWEB_SET_WEB_CONTENTS_SIZE = true;
    public static final boolean XWEB_SMART_PICK = true;
    public static final boolean XWEB_TEXT_AREA = true;
    public static final boolean XWEB_TRANSLATE = true;
    public static final boolean XWEB_VIDEO_AUTOPLAY_FLAG = true;
    public static final boolean XWEB_VIDEO_HIDE_DOWNLOAD_UI = true;

    @Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    public @interface REMOVABLE_XWEB_CUSTOM_FULLSCREEN {
    }

    @Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    public @interface REMOVABLE_XWEB_INPUT {
    }

    @Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    public @interface REMOVABLE_XWEB_TEXT_AREA {
    }

    public @interface XWEB_ACTIVITY_BIND {
    }

    public @interface XWEB_AUDIO_AUTOPLAY_FLAG {
    }

    public @interface XWEB_BACKGROUND_AUDIO_PAUSE {
    }

    public @interface XWEB_COMMON {
    }

    public @interface XWEB_CREATE_CLOSE_WINDOW {
    }

    public @interface XWEB_CUSTOM_FULLSCREEN {
    }

    public @interface XWEB_DARK_MODE {
    }

    public @interface XWEB_FORCE_WAITING_SWAP {
    }

    public @interface XWEB_IMAGE_TO_FILE {
    }

    public @interface XWEB_INPUT {
    }

    public @interface XWEB_JAVASCRIPT_CAN_ACCESS_CLIPBOARD {
    }

    public @interface XWEB_KEEP_INPUT_OUT_OF_KEYBOARD {
    }

    public @interface XWEB_LONG_PRESS_TIME_CUSTOMIZE {
    }

    public @interface XWEB_QUIC {
    }

    public @interface XWEB_RECOVER_VSYNC_CALLBACK {
    }

    public @interface XWEB_SAME_LAYER {
    }

    public @interface XWEB_SCROLLBAR {
    }

    public @interface XWEB_SEARCH {
    }

    public @interface XWEB_SET_BOTTOM_HEIGHT {
    }

    public @interface XWEB_SET_WEB_CONTENTS_SIZE {
    }

    public @interface XWEB_SMART_PICK {
    }

    public @interface XWEB_TEXT_AREA {
    }

    public @interface XWEB_TRANSLATE {
    }

    public @interface XWEB_VIDEO_AUTOPLAY_FLAG {
    }

    public @interface XWEB_VIDEO_HIDE_DOWNLOAD_UI {
    }
}
