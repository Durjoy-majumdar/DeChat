package gw2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import te3.bc4;

/* renamed from: gw2.m */
public final class C98268m {

    /* renamed from: a */
    public int f288088a;

    /* renamed from: b */
    public final long f288089b;

    /* renamed from: c */
    public int f288090c;

    /* renamed from: d */
    public String f288091d;

    /* renamed from: e */
    public C98269n f288092e = C98269n.Normal;

    /* renamed from: f */
    public bc4 f288093f;

    /* renamed from: g */
    public String f288094g;

    public C98268m(int i, long j, int i2, String str) {
        C87412m.m108594g(str, "username");
        this.f288088a = i;
        this.f288089b = j;
        this.f288090c = i2;
        this.f288091d = str;
        bc4 bc4 = new bc4();
        bc4.f297961f = "";
        bc4.f297963h = "";
        bc4.f297959d = "";
        this.f288093f = bc4;
        this.f288094g = "";
    }

    /* renamed from: a */
    public final boolean mo137567a() {
        return this.f288092e == C98269n.Fake;
    }

    /* renamed from: b */
    public final boolean mo137568b() {
        Log.m105924i("MicroMsg.Story.StoryVideoItem", "item" + this.f288094g + " is not fake isVLogFakeVideo");
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C98268m)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C98269n nVar = this.f288092e;
        C98269n nVar2 = C98269n.Empty;
        if (nVar == nVar2 && ((C98268m) obj).f288092e == nVar2) {
            return true;
        }
        if (mo137567a()) {
            C98268m mVar = (C98268m) obj;
            if (mVar.mo137567a() && Util.isEqual(this.f288094g, mVar.f288094g)) {
                return true;
            }
        }
        C98269n nVar3 = this.f288092e;
        C98269n nVar4 = C98269n.Normal;
        if (nVar3 == nVar4) {
            C98268m mVar2 = (C98268m) obj;
            return (mVar2.f288092e == nVar4) && this.f288088a == mVar2.f288088a;
        }
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "[VideoItem=" + super.hashCode() + ",localId=:" + this.f288088a + ",storyId=" + this.f288089b + ",videoType:=" + this.f288092e + ", username=" + this.f288091d + ", url=" + this.f288093f.f297961f + ']';
    }
}
