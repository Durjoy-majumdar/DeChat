package qh2;

import android.os.Bundle;
import lh2.C109344g0;

/* renamed from: qh2.e */
public interface C101198e {

    /* renamed from: qh2.e$a */
    public static final class C62622a {
        /* renamed from: a */
        public static /* synthetic */ void m73576a(C101198e eVar, C101199b bVar, Bundle bundle, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    bundle = null;
                }
                eVar.mo14585p(bVar, bundle);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: statusChange");
        }
    }

    /* renamed from: qh2.e$b */
    public enum C101199b {
        PREPARE_CAMERA_ZOOM,
        TRIGGER_CAMERA_ZOOM,
        SWITCH_CAMERA,
        SWITCH_FLASH,
        FOCUS_ON_TOUCH,
        RECORD_START,
        RECORD_FINISH,
        RECORD_BACK,
        SUB_RECORD_FINISH,
        SUB_RECORD_PREPARE_DELETE,
        SUB_RECORD_CANCEL_DELETE,
        SUB_RECORD_DELETE,
        RECORD_PICTURE,
        RECORD_ROUTE,
        RECORD_BEAUTIFY,
        RECORD_BEAUTIFY_SETTING,
        RECORD_BEAUTIFY_CONFIG,
        RECORD_UN_CLICK_MUSIC,
        RECORD_TYPE_CHANGE,
        RECORD_CANCEL_COUNTDOWN,
        RECORD_FINISH_COUNTDOWN,
        BACK_RECORD,
        START_PLAY_VIDEO,
        EDIT_VIDEO_WITH_EMOJI,
        EDIT_VIDEO_WITH_TEXT,
        EDIT_VIDEO_WITH_TIP,
        EDIT_VIDEO_SEEK,
        EDIT_SHOW_EMOJI,
        EDIT_ADD_TEXT,
        EDIT_SHOW_TEXT,
        EDIT_ADD_TEXT_CANCEL,
        EDIT_ADD_TIP,
        EDIT_ADD_POI,
        EDIT_CHANGE_TEXT,
        EDIT_CHANGE_TIP,
        EDIT_CHANGE_POI,
        EDIT_ADD_MUSIC,
        EDIT_ADD_MUSIC_DONE,
        EDIT_ADD_MUSIC_ENTER_SELECT_ENTRANCE,
        EDIT_DELETE_ITEM,
        EDIT_IN_PREVIEW,
        EDIT_SET_ORIGIN_MUTE,
        EDIT_SELECT_MUSIC,
        EDIT_SELECT_LYRICS,
        EDIT_CROP_VIDEO,
        EDIT_FORCE_CROP_VIDEO,
        EDIT_CROP_VIDEO_LENGTH,
        EDIT_CROP_VIDEO_PERCENT,
        EDIT_CROP_VIDEO_PAUSE,
        EDIT_CROP_VIDEO_RESUME,
        EDIT_CROP_CANCEL,
        EDIT_CROP_FINISH,
        EDIT_FINISH,
        EDIT_START_MUX,
        EDIT_VIDEO_PREPARE,
        EDIT_DELETE_ITEM_DONE,
        EDIT_PREVIEW_MODE_CHANGE,
        EDIT_PHOTO_CROP,
        EDIT_PHOTO_DOODLE,
        EDIT_PHOTO_DOODLE_CLICK,
        EDIT_PHOTO_DOODLE_MOVE_START,
        EDIT_PHOTO_DOODLE_MOVE_STOP,
        EDIT_PHOTO_DOODLE_CANCEL,
        EDIT_PHOTO_DOODLE_MSC,
        EDIT_PHOTO_DOODLE_BRUSH,
        EDIT_PHOTO_DOODLE_PENCIL,
        EDIT_PHOTO_DOODLE_UNDO,
        EDIT_PHOTO_CROP_CANCEL,
        EDIT_PHOTO_CROP_FINISH,
        EDIT_PHOTO_CROP_ROTATE,
        EDIT_PHOTO_CROP_UNDO,
        EDIT_PHOTO_SHOW_FUNC_LAYOUT,
        EDIT_PHOTO_FILTER_CANCEL,
        EDIT_PHOTO_FILTER_ENTER,
        EDIT_VLOG_SIZE_CHANGE,
        EDIT_VLOG_PREPARE,
        EDIT_VLOG_SEARCH_MUSIC_FINISH,
        EDIT_VLOG_SEARCH_MUSIC_CANCEL,
        EDIT_VLOG_SEARCH_MUSIC_SCRIPT_FINISH,
        EDIT_VLOG_MULTI_IMAGE_SELECT,
        EDIT_VLOG_SELECT_TRACK,
        EDIT_VLOG_TRACK_CROP,
        EDIT_COMPOSITION_DURATION_CUT,
        EDIT_COMPOSITION_TAP_DOWN,
        EDIT_COMPOSITION_TAP_UP,
        EDIT_VLOG_SINGLE_TRACK_CROP,
        EDIT_VLOG_EDIT_TIME,
        EDIT_VLOG_EDIT_TIME_FINISH,
        EDIT_VLOG_EDIT_SPEED,
        EDIT_VLOG_CHANGE_PLAY_RANGE,
        EDIT_ADD_EMOJI,
        EDIT_TRACK_DURATION_SCALE,
        EDIT_TRACK_DURATION_SCALE_FINISH,
        EDIT_ADD_CAPTION,
        EDIT_CAPTION,
        EDIT_SHOW_CAPTION,
        EDIT_UPDATE_CAPTION,
        EDIT_DELETE_CAPTION,
        EDIT_CANCEL_CAPTION,
        EDIT_CLICK_VIEW,
        EDIT_SHOW_TRANSITION_MARK,
        EDIT_HIDE_TRANSITION_MARK,
        EDIT_SELECT_TRANSITION,
        EDIT_UNSELECT_TRANSITION,
        EDIT_REFRESH_TRANSITION_MARK_STATUS,
        EDIT_SET_TRANSITION,
        EDIT_APPLY_ALL_TRANSITION,
        EDIT_ADD_PAG_STICKER,
        EDIT_CHANGE_PAG_TEXT,
        EDIT_UPDATE_PAG_TEXT,
        EDIT_FINISH_PAG_MAGIC,
        EDIT_SHOW_TRANSITION_PANEL,
        EDIT_HIDE_OPERATION,
        EDIT_SHOW_OPERATION,
        EDIT_START_TTS,
        EDIT_END_TTS,
        EDIT_CANCEL_TTS,
        EDIT_REMOVE_TTS,
        EDIT_SELECT_TEMPLATE_MODE,
        EDIT_SELECT_NORMAL_MODE,
        EDIT_CHOOSE_TEMPLATE,
        EDIT_SHOW_ADD_MUSIC,
        FINDER_SHOW_GUIDE,
        RECORD_SWITCH_TEMPLATE,
        RECORD_SWITCH_SCREEN,
        FIRST_FRAME_RENDER,
        UI_FINISH
    }

    /* renamed from: f */
    void mo129834f(C109344g0 g0Var);

    /* renamed from: p */
    void mo14585p(C101199b bVar, Bundle bundle);
}
