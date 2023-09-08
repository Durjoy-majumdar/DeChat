package kw2;

import android.database.Cursor;
import android.text.format.DateFormat;
import bw2.C92326a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import cw2.C97387k;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.regex.Pattern;
import o40.C61926c;
import p749xh.C102642e6;
import pe3.C47465a;
import te3.C101765cp3;
import te3.cc4;
import te3.pc4;
import te3.sb4;

/* renamed from: kw2.i */
public final class C99268i extends C102642e6 {

    /* renamed from: M */
    public static final IAutoDBItem.MAutoDBInfo f291073M = C102642e6.initAutoDBInfo(C99268i.class);

    /* renamed from: N */
    public static final String f291074N = "rowid";

    /* renamed from: P */
    public static final String f291075P = "serverStoryNameIndex";

    /* renamed from: Q */
    public static final String f291076Q = "serverStoryNameTimeIndex";

    /* renamed from: R */
    public static final String f291077R = "serverStoryUsernameCreateTimeIndex";

    /* renamed from: L */
    public int f291078L;

    public C99268i() {
        new ArrayList();
        new ArrayList();
    }

    public void convertFrom(Cursor cursor) {
        C87412m.m108594g(cursor, "cu");
        super.convertFrom(cursor);
        C92326a.C92327a aVar = C92326a.f264186a;
        int i = 0;
        try {
            i = Integer.parseInt(DateFormat.format(MMApplicationContext.getContext().getString(C0966R.string.jo9), ((long) this.field_createTime) * 1000).toString());
        } catch (NumberFormatException e) {
            C92326a.C92327a aVar2 = C92326a.f264186a;
            Log.printErrStackTrace("MicroMsg.StoryTimeUtil", e, "NumberFormatException", new Object[0]);
        }
        this.f291078L = i;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = f291073M;
        C87412m.m108593f(mAutoDBInfo, "info");
        return mAutoDBInfo;
    }

    /* renamed from: l2 */
    public final void mo138653l2(int i) {
        int i2 = this.field_itemStoryFlag;
        Pattern pattern = C61926c.f176038a;
        this.field_itemStoryFlag = i | i2;
    }

    /* renamed from: m2 */
    public final boolean mo138654m2() {
        return C61926c.m72696u(this.field_itemStoryFlag, 8);
    }

    /* renamed from: n2 */
    public final cc4 mo138655n2() {
        cc4 cc4 = new cc4();
        if (this.field_postBuf == null) {
            return cc4;
        }
        try {
            C47465a parseFrom = new cc4().parseFrom(this.field_postBuf);
            C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryMediaPostInfo");
            return (cc4) parseFrom;
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.StoryInfo", "error get StoryMediaPostInfo " + this.field_storyID);
            return new cc4();
        }
    }

    /* renamed from: o2 */
    public final boolean mo138656o2() {
        return C61926c.m72696u(this.field_localFlag, 16);
    }

    /* renamed from: p2 */
    public final pc4 mo138657p2() {
        if (this.field_content == null) {
            pc4 pc4 = new pc4();
            sb4 sb4 = new sb4();
            C101765cp3 cp32 = new C101765cp3();
            cp32.f298034e = 0.0f;
            cp32.f298033d = 0.0f;
            pc4.f299135g = cp32;
            pc4.f299136h = sb4;
            pc4.f299132d = "";
            pc4.f299134f = 0;
            return pc4;
        }
        try {
            C47465a parseFrom = new pc4().parseFrom(this.field_content);
            C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryTimelineObject");
            return (pc4) parseFrom;
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.StoryInfo", "error get storyinfo timeline!");
            pc4 pc42 = new pc4();
            sb4 sb42 = new sb4();
            C101765cp3 cp33 = new C101765cp3();
            cp33.f298034e = 0.0f;
            cp33.f298033d = 0.0f;
            pc42.f299135g = cp33;
            pc42.f299136h = sb42;
            pc42.f299132d = "";
            pc42.f299134f = 0;
            return pc42;
        }
    }

    /* renamed from: q2 */
    public final boolean mo138658q2() {
        int i = this.field_createTime;
        int e = C31543z5.m39455e();
        C97387k.f285887a.mo136646a();
        return i <= e - 86400;
    }

    /* renamed from: r2 */
    public final void mo138659r2(int i) {
        int i2 = this.field_itemStoryFlag;
        Pattern pattern = C61926c.f176038a;
        this.field_itemStoryFlag = (~i) & i2;
    }

    /* renamed from: s2 */
    public final boolean mo138660s2(pc4 pc4) {
        C87412m.m108594g(pc4, "contentObj");
        try {
            this.field_content = pc4.toByteArray();
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.StoryInfo", e, "", new Object[0]);
            return false;
        }
    }

    /* renamed from: t2 */
    public final void mo138661t2(boolean z) {
        int i;
        if (z) {
            int i2 = this.field_localFlag;
            Pattern pattern = C61926c.f176038a;
            i = i2 | 16;
        } else {
            int i3 = this.field_localFlag;
            Pattern pattern2 = C61926c.f176038a;
            i = i3 & -17;
        }
        this.field_localFlag = i;
    }

    /* renamed from: u2 */
    public final void mo138662u2(pc4 pc4) {
        C87412m.m108594g(pc4, "timeline");
        try {
            this.field_content = pc4.toByteArray();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.StoryInfo", e, "", new Object[0]);
        }
    }
}
