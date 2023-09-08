package bd1;

import gy3.C8480h;
import java.util.Set;
import sx3.C64187h0;

/* renamed from: bd1.i */
public enum C39759i {
    UPGRADE((String) null, 1, (Set) null),
    ACCOUNT_CREATE((String) null, 1, (Set) null),
    ACCOUNT_MODIFY((String) null, 1, (Set) null),
    FINDER_GET_MENTION_LIST((String) null, 1, (Set) null),
    FINDER_ORIGINAL((String) null, 1, (Set) null),
    FINDER_INIT((String) null, 1, (Set) null),
    FINDER_RE_INIT((String) null, 1, (Set) null),
    SAVE_ROLE_CHOOSER((String) null, 1, (Set) null),
    MODIFY_USER((String) null, 1, (Set) null),
    USER_PAGE((String) null, 1, (Set) null),
    USER_PREPARE((String) null, 1, (Set) null),
    JOIN_LIVE((String) null, 1, (Set) null),
    LIVE_LOTTERY_CREATE((String) null, 1, (Set) null),
    LIVE_UPDATE_ANCHOR_STATUS((String) null, 1, (Set) null),
    AGREE_SAVE_PHONE((String) null, 1, (Set) null),
    FINDER_CONFIG((String) null, 1, (Set) null),
    FINDER_SETTING_PERSONALIZED((String) null, 1, (Set) null),
    MOD_OVERSEA((String) null, 1, (Set) null),
    APP_START_UP((String) null, 1, (Set) null),
    SYS_MSG_COUNT((String) null, 1, (Set) null),
    FINDER_SYNC((String) null, 1, (Set) null);
    

    /* renamed from: d */
    public final Set<String> f106704d;

    /* access modifiers changed from: public */
    C39759i(Set<String> set, int i, C8480h hVar) {
        this.f106704d = (i & 1) != 0 ? C64187h0.f181908d : set;
    }
}
