package qj1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import bl3.C39818r;
import cl1.C54991o;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import java.io.InputStream;
import k60.C60979d;
import l60.C99344b;
import ok1.C62042e;
import pl1.C100810g0;
import pl1.C11990s0;
import pl1.C11991t;
import rx3.C13598b0;
import te3.C64756up2;

/* renamed from: qj1.u3 */
public final class C63004u3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63081w3 f178766d;

    /* renamed from: e */
    public final /* synthetic */ C64756up2 f178767e;

    /* renamed from: f */
    public final /* synthetic */ String f178768f;

    /* renamed from: g */
    public final /* synthetic */ String f178769g;

    /* renamed from: h */
    public final /* synthetic */ String f178770h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63004u3(C63081w3 w3Var, C64756up2 up22, String str, String str2, String str3) {
        super(0);
        this.f178766d = w3Var;
        this.f178767e = up22;
        this.f178768f = str;
        this.f178769g = str2;
        this.f178770h = str3;
    }

    public Object invoke() {
        Class cls = C54991o.class;
        Class cls2 = C11990s0.class;
        Class<C60200t1> cls3 = C60200t1.class;
        this.f178766d.mo10792g(0);
        C64756up2 up22 = this.f178767e;
        boolean z = true;
        if (up22 == null || !C62042e.f176370a.mo87097m1(up22)) {
            z = false;
        }
        if (z) {
            C63081w3.m74375Z0(this.f178766d, this.f178767e);
        } else {
            String str = "";
            if (!Util.isNullOrNil(this.f178768f)) {
                C60979d<C100810g0> f2 = ((C11990s0) C39818r.f106831a.mo62446e(cls3).mo62447c(cls2)).mo11871f2();
                String str2 = this.f178768f;
                if (str2 != null) {
                    str = str2;
                }
                C99344b<C100810g0, Bitmap> a = f2.mo85955a(new C11991t(str));
                C62948r3 r3Var = new C62948r3(this.f178766d);
                a.getClass();
                a.f291320d = r3Var;
                a.mo85951a();
            } else if (!Util.isNullOrNil(this.f178769g)) {
                C60979d<C100810g0> f25 = ((C11990s0) C39818r.f106831a.mo62446e(cls3).mo62447c(cls2)).mo11871f2();
                String str3 = this.f178769g;
                if (str3 != null) {
                    str = str3;
                }
                C99344b<C100810g0, Bitmap> a2 = f25.mo85955a(new C11991t(str));
                C62989t3 t3Var = new C62989t3(this.f178766d);
                a2.getClass();
                a2.f291320d = t3Var;
                a2.mo85951a();
            } else if (!Util.isNullOrNil(this.f178770h)) {
                String str4 = this.f178770h;
                if (str4 != null) {
                    str = str4;
                }
                Uri n = C116299g2.m163858n(str);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                InputStream C = C86013q1.m106421C(n, C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null));
                C87412m.m108593f(C, "openRead(this)");
                Bitmap decodeStream = BitmapUtil.decodeStream(C);
                this.f178766d.f179015r.setImageDrawable(new BitmapDrawable(this.f178766d.f166287d.getContext().getResources(), decodeStream));
                ((C54991o) this.f178766d.mo87696x0(cls)).f154254S2 = decodeStream;
            }
        }
        String str5 = this.f178766d.f179014q;
        Log.m105924i(str5, "liveCoverUrl:" + this.f178768f + ", avatarUrl:" + this.f178769g + ", choosePath:" + this.f178770h + ", business(LiveCommonSlice::class.java).audioModeHolderBm:" + ((C54991o) this.f178766d.mo87696x0(cls)).f154254S2);
        return C13598b0.f38549a;
    }
}
