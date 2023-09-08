package d50;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.ArrayList;

/* renamed from: d50.i */
public final class C58115i {

    /* renamed from: a */
    public boolean f166254a;

    /* renamed from: b */
    public C58118c f166255b = C58118c.LIVE_OUT_ROOM;

    /* renamed from: c */
    public C58116a f166256c = C58116a.NO_LINK_MIC;

    /* renamed from: d */
    public C58120e f166257d = C58120e.ROLE_DEFAULT;

    /* renamed from: e */
    public C58119d f166258e = C58119d.NORMAL_MODE;

    /* renamed from: f */
    public long f166259f = -1;

    /* renamed from: g */
    public String f166260g = "";

    /* renamed from: h */
    public String f166261h = "";

    /* renamed from: i */
    public C58117b f166262i = C58117b.NORMAL_MODE;

    /* renamed from: j */
    public boolean f166263j;

    /* renamed from: k */
    public boolean f166264k;

    /* renamed from: l */
    public int f166265l;

    /* renamed from: m */
    public int f166266m;

    /* renamed from: n */
    public boolean f166267n;

    /* renamed from: d50.i$a */
    public enum C58116a {
        NO_LINK_MIC,
        AUDIO_LINK_MIC,
        VIDEO_LINK_MIC
    }

    /* renamed from: d50.i$b */
    public enum C58117b {
        NORMAL_MODE,
        AUDIO_MODE
    }

    /* renamed from: d50.i$c */
    public enum C58118c {
        LIVE_OUT_ROOM,
        LIVE_IN_ROOM,
        LIVE_JOIN_ROOM
    }

    /* renamed from: d50.i$d */
    public enum C58119d {
        NORMAL_MODE,
        FLOAT_MODE,
        PERMISSION_MODE,
        LIVE_SQUARE_MODE
    }

    /* renamed from: d50.i$e */
    public enum C58120e {
        ROLE_DEFAULT,
        ROLE_APPLY_PK
    }

    public C58115i() {
        new ArrayList();
        boolean z = false;
        this.f166265l = 0;
        this.f166266m = -1;
        this.f166267n = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_LIVE_DEBUG_VIEW_INT_SYNC, 0) == 1 ? true : z;
    }

    /* renamed from: a */
    public final void mo82879a() {
        this.f166258e = C58119d.NORMAL_MODE;
        Log.m105924i("MicroMsg.LiveStatus", "liveStatusModeChange changeToNormalMode");
    }

    /* renamed from: b */
    public final boolean mo82880b() {
        return this.f166262i == C58117b.AUDIO_MODE;
    }

    /* renamed from: c */
    public final boolean mo82881c() {
        return this.f166258e == C58119d.FLOAT_MODE;
    }

    /* renamed from: d */
    public final boolean mo82882d() {
        return this.f166256c == C58116a.AUDIO_LINK_MIC;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r7.f166255b == r0) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r7.f166255b == r0) goto L_0x000c;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo82883e(java.lang.Long r8) {
        /*
            r7 = this;
            d50.i$c r0 = d50.C58115i.C58118c.LIVE_IN_ROOM
            r1 = 1
            r2 = 0
            if (r8 != 0) goto L_0x000e
            d50.i$c r8 = r7.f166255b
            if (r8 != r0) goto L_0x000b
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            r2 = r1
            goto L_0x001d
        L_0x000e:
            long r3 = r7.f166259f
            long r5 = r8.longValue()
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x001d
            d50.i$c r8 = r7.f166255b
            if (r8 != r0) goto L_0x000b
            goto L_0x000c
        L_0x001d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d50.C58115i.mo82883e(java.lang.Long):boolean");
    }

    /* renamed from: f */
    public final boolean mo82884f() {
        return this.f166256c == C58116a.VIDEO_LINK_MIC;
    }

    /* renamed from: g */
    public final boolean mo82885g() {
        return this.f166255b == C58118c.LIVE_IN_ROOM;
    }

    /* renamed from: h */
    public final boolean mo82886h() {
        return this.f166258e == C58119d.NORMAL_MODE;
    }

    /* renamed from: i */
    public final boolean mo82887i() {
        return this.f166264k;
    }

    /* renamed from: j */
    public final boolean mo82888j() {
        return this.f166258e == C58119d.LIVE_SQUARE_MODE;
    }

    /* renamed from: k */
    public final void mo82889k() {
        Log.m105924i("MicroMsg.LiveStatus", "switchAudioMode,pause:" + this.f166263j);
        this.f166263j = false;
        this.f166262i = C58117b.AUDIO_MODE;
    }

    /* renamed from: l */
    public final void mo82890l() {
        Log.m105924i("MicroMsg.LiveStatus", "switchVideoMode,pause:" + this.f166263j);
        this.f166263j = false;
        this.f166262i = C58117b.NORMAL_MODE;
    }
}
