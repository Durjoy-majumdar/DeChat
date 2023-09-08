package com.tencent.xweb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import java.util.HashMap;

public class XFileSdk {
    public static final int FEATURE_ACTION_CALLBACK = 1;
    public static final int FEATURE_BOTTOM_BAR = 2;
    public static final int FEATURE_GENERAL = 0;
    public static final int FR_ERR_CODE_DISABLE_PASSWORD = -17;
    public static final int FR_ERR_CODE_DOWNLOAD_CANCEL = -15;
    public static final int FR_ERR_CODE_DOWNLOAD_CONFIG_DOWNLOAD_FAILED = -22;
    public static final int FR_ERR_CODE_DOWNLOAD_CONFIG_PARSE_FAILED = -23;
    public static final int FR_ERR_CODE_DOWNLOAD_NO_AVAILABLE_UPDATE = -25;
    public static final int FR_ERR_CODE_DOWNLOAD_NO_NEED_TO_FETCH_CONFIG = -20;
    public static final int FR_ERR_CODE_DOWNLOAD_NO_NETWORK = -19;
    public static final int FR_ERR_CODE_DOWNLOAD_NO_PLUGIN_IN_CONFIG = -24;
    public static final int FR_ERR_CODE_DOWNLOAD_OTHERS_IS_UPDATING = -21;
    public static final int FR_ERR_CODE_DOWNLOAD_PLUGIN_ONLY_DOWNLOAD_ERROR = -27;
    public static final int FR_ERR_CODE_DOWNLOAD_PLUGIN_ONLY_INSTALL_ERROR = -28;
    public static final int FR_ERR_CODE_DOWNLOAD_PLUGIN_UPDATE_ERROR = -26;
    public static final int FR_ERR_CODE_DOWNLOAD_START_FAILED = -18;
    public static final int FR_ERR_CODE_FILE_NOT_EXIST = -6;
    public static final int FR_ERR_CODE_FILE_NOT_SUPPORT = -7;
    public static final int FR_ERR_CODE_INIT_ERROR = -4;
    public static final int FR_ERR_CODE_INVOKE_ERROR = -3;
    public static final int FR_ERR_CODE_NONE = 0;
    public static final int FR_ERR_CODE_PASSWORD_ERROR = -12;
    public static final int FR_ERR_CODE_PLUGIN_FORBID_DOWNLOAD_CODE = -1;
    public static final int FR_ERR_CODE_PLUGIN_NOT_INSTALLED = -2;
    public static final int FR_ERR_CODE_SO_ERROR = -13;
    public static final int FR_ERR_CODE_TASK_EXIST = -8;
    public static final int FR_ERR_CODE_TASK_PREPARE_ERROR = -9;
    public static final int FR_ERR_CODE_TASK_RUN_ERROR = -10;
    public static final int FR_ERR_CODE_VERSION_TOO_OLD = -11;
    public static final int FR_ERR_CODE_VIEW_DESTROY = -14;
    public static final int FR_ERR_CODE_WRONG_PARAM = -5;
    public static final String GENERAL_CALLBACK_NAME_ON_CUSTOM_MENU_CLICK = "gc_onCustomMenuClick";
    public static final String GENERAL_CALLBACK_PARAM_KEY_CUSTOM_MENU_ID = "gc_customMenuId";
    public static final String PARAM_KEY_EXTRA_PARAM_BG_COLOR = "extra_param_bg_color";
    public static final String PARAM_KEY_EXTRA_PARAM_BOTTOM_BAR_TOTAL_HEIGHT_PX = "extra_param_bottom_bar_total_height_px";
    public static final String PARAM_KEY_EXTRA_PARAM_CAN_DOWNLOAD_WHEN_PLUGIN_ERROR = "extra_param_can_download_when_plugin_error";
    public static final String PARAM_KEY_EXTRA_PARAM_CUSTOM_MENU = "extra_param_custom_menu";
    public static final String PARAM_KEY_EXTRA_PARAM_CUSTOM_MENU_ARRAY = "custom_menu_array";
    public static final String PARAM_KEY_EXTRA_PARAM_CUSTOM_MENU_DISPLAY = "custom_menu_display";
    public static final String PARAM_KEY_EXTRA_PARAM_CUSTOM_MENU_ID = "custom_menu_id";
    public static final String PARAM_KEY_EXTRA_PARAM_CUSTOM_MENU_SUB_DISPLAY = "custom_menu_sub_display";
    public static final String PARAM_KEY_EXTRA_PARAM_DISABLE_FINISH_ACTIVITY = "extra_param_disable_finish_activity";
    public static final String PARAM_KEY_EXTRA_PARAM_DISABLE_PASSWORD = "extra_param_disable_password";
    public static final String PARAM_KEY_EXTRA_PARAM_DISABLE_SCALE = "extra_param_disable_scale";
    public static final String PARAM_KEY_EXTRA_PARAM_DISABLE_TOUCH = "extra_param_disable_touch";
    public static final String PARAM_KEY_EXTRA_PARAM_DOWNLOAD_TEXT_COLOR = "extra_param_download_text_color";
    public static final String PARAM_KEY_EXTRA_PARAM_ENABLE_RECEIVE_VIEW_STATUS_CHANGE = "extra_param_enable_receive_view_status_change";
    public static final String PARAM_KEY_EXTRA_PARAM_FILE_MD5 = "extra_param_file_md5";
    public static final String PARAM_KEY_EXTRA_PARAM_IS_QB_INSTALLED = "extra_param_is_qb_installed";
    public static final String PARAM_KEY_EXTRA_PARAM_OPEN_FILE_FROM = "extra_param_open_file_from";
    public static final String PARAM_KEY_EXTRA_PARAM_OPEN_FILE_SCENE = "extra_param_open_file_scene";
    public static final String PARAM_KEY_EXTRA_PARAM_SET_MAX_SCALE = "extra_param_set_max_scale";
    private static final String TAG = "XFileSdk";
    public static final String VIEW_TAG_BOTTOM_BAR = "view_tag_bottom_bar";
    public static final String VIEW_TAG_RELATIVE_LAYOUT = "view_tag_relative_layout";
    public static final String VIEW_TAG_TOOLBAR = "view_tag_toolbar";

    public interface ActionCallback {
        void onDoubleTap(MotionEvent motionEvent);

        void onGeneralCallback(String str, HashMap<String, Object> hashMap);

        void onPageChange(int i, int i2, int i3);

        void onPageCountUpdate(int i);

        void onReachEnd();

        void onSingleTap(MotionEvent motionEvent);

        void onThumbnailLoad(int i, Bitmap bitmap);

        void onUserCancel();

        void onUserOperated();

        void onViewStatusChange(int i, float f, int i2, int i3, int i4, int i5);
    }

    public enum ViewType {
        ListView,
        ReaderView
    }

    public static class ViewStatus {
        public int index;
        public int transX;
        public int transY;
        public float zoom;

        public ViewStatus(int i, float f, int i2, int i3) {
            this.index = i;
            this.zoom = f;
            this.transX = i2;
            this.transY = i3;
        }
    }

    public static void finishReadFile(String str, String str2) {
        FileReaderXWeb.finishReadFile(str, str2);
    }

    public static ViewStatus getViewStatus(String str, String str2) {
        return FileReaderXWeb.getViewStatus(str, str2);
    }

    public static boolean isPluginAvailable(String str, boolean z, boolean z2, int i) {
        return FileReaderXWeb.isPluginAvailable(str, z, z2, i);
    }

    public static void readFile(String str, String str2, String str3, boolean z, HashMap<String, String> hashMap, ViewType viewType, Activity activity, ViewGroup viewGroup, ActionCallback actionCallback, ValueCallback<Integer> valueCallback) {
        FileReaderXWeb.readFile(str, str2, str3, z, hashMap, viewType, activity, viewGroup, actionCallback, valueCallback);
    }

    public static boolean requestThumbnail(String str, String str2, int i) {
        return FileReaderXWeb.requestThumbnail(str, str2, i);
    }

    public static boolean setDisableDoubleTap(String str, String str2, boolean z) {
        return FileReaderXWeb.setDisableDoubleTap(str, str2, z);
    }

    public static boolean setDisableScroll(String str, String str2, boolean z) {
        return FileReaderXWeb.setDisableScroll(str, str2, z);
    }

    public static boolean setTouchEvent(String str, String str2, MotionEvent motionEvent) {
        return FileReaderXWeb.setTouchEvent(str, str2, motionEvent);
    }

    public static boolean setViewToStatus(String str, String str2, int i, float f, int i2, int i3) {
        return FileReaderXWeb.setViewToStatus(str, str2, i, f, i2, i3);
    }

    public static void readFile(String str, String str2, String str3, boolean z, HashMap<String, String> hashMap, Activity activity, ViewGroup viewGroup, ActionCallback actionCallback, ValueCallback<Integer> valueCallback) {
        FileReaderXWeb.readFile(str, str2, str3, z, hashMap, ViewType.ListView, activity, viewGroup, actionCallback, valueCallback);
    }
}
