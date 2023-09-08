package kw2;

import android.database.Cursor;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72994y1;
import cw2.C97387k;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import p749xh.C102677x8;

/* renamed from: kw2.e */
public final class C99264e extends C102677x8 {

    /* renamed from: W */
    public static final IAutoDBItem.MAutoDBInfo f291058W = C102677x8.initAutoDBInfo(C99264e.class);

    /* renamed from: X */
    public static final C32227p<Long, Long, Boolean> f291059X = C61176a.f174156d;

    /* renamed from: kw2.e$a */
    public static final class C61176a extends C87413o implements C32227p<Long, Long, Boolean> {

        /* renamed from: d */
        public static final C61176a f174156d = new C61176a();

        public C61176a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            long longValue = ((Number) obj).longValue();
            long longValue2 = ((Number) obj2).longValue();
            boolean z = false;
            boolean z2 = (longValue < 0) ^ (longValue < longValue2);
            if (longValue2 < 0) {
                z = true;
            }
            return Boolean.valueOf(z2 ^ z);
        }
    }

    public C99264e() {
        this.field_userName = "";
    }

    public void convertFrom(Cursor cursor) {
        C87412m.m108594g(cursor, "cu");
        super.convertFrom(cursor);
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f291058W;
        C87412m.m108593f(mAutoDBInfo, "info");
        return mAutoDBInfo;
    }

    public final String getUserName() {
        String str = this.field_userName;
        C87412m.m108593f(str, "field_userName");
        return str;
    }

    public final boolean isValid() {
        if (this.field_syncId != 0) {
            int i = this.field_storyPostTime;
            C97387k.f285887a.mo136646a();
            if (i + 86400 >= C31543z5.m39455e()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l2 */
    public final boolean mo138638l2() {
        if (isValid()) {
            C32227p<Long, Long, Boolean> pVar = f291059X;
            if (((Boolean) ((C61176a) pVar).invoke(Long.valueOf(this.field_readId), Long.valueOf(this.field_syncId))).booleanValue()) {
                StoryCore.f281736t.getClass();
                if (StoryCore.f281739w == -1) {
                    StoryCore.f281739w = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_STORY_SNS_ALL_READ_TIME_LONG, 0);
                }
                if (((Boolean) ((C61176a) pVar).invoke(Long.valueOf(StoryCore.f281739w), Long.valueOf(this.field_updateTime))).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
