package pi1;

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
import pl1.C100810g0;
import pl1.C11990s0;
import pl1.C11991t;
import rx3.C13598b0;

/* renamed from: pi1.e */
public final class C62302e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62305h f177107d;

    /* renamed from: e */
    public final /* synthetic */ String f177108e;

    /* renamed from: f */
    public final /* synthetic */ String f177109f;

    /* renamed from: g */
    public final /* synthetic */ String f177110g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62302e(C62305h hVar, String str, String str2, String str3) {
        super(0);
        this.f177107d = hVar;
        this.f177108e = str;
        this.f177109f = str2;
        this.f177110g = str3;
    }

    public Object invoke() {
        Class cls = C54991o.class;
        Class cls2 = C11990s0.class;
        Class<C60200t1> cls3 = C60200t1.class;
        this.f177107d.f177115v.f175487f.setVisibility(0);
        String str = "";
        if (!Util.isNullOrNil(this.f177108e)) {
            C60979d<C100810g0> f2 = ((C11990s0) C39818r.f106831a.mo62446e(cls3).mo62447c(cls2)).mo11871f2();
            String str2 = this.f177108e;
            if (str2 != null) {
                str = str2;
            }
            C99344b<C100810g0, Bitmap> a = f2.mo85955a(new C11991t(str));
            C62299b bVar = new C62299b(this.f177107d);
            a.getClass();
            a.f291320d = bVar;
            a.mo85951a();
        } else if (!Util.isNullOrNil(this.f177109f)) {
            C60979d<C100810g0> f25 = ((C11990s0) C39818r.f106831a.mo62446e(cls3).mo62447c(cls2)).mo11871f2();
            String str3 = this.f177109f;
            if (str3 != null) {
                str = str3;
            }
            C99344b<C100810g0, Bitmap> a2 = f25.mo85955a(new C11991t(str));
            C62301d dVar = new C62301d(this.f177107d);
            a2.getClass();
            a2.f291320d = dVar;
            a2.mo85951a();
        } else if (!Util.isNullOrNil(this.f177110g)) {
            String str4 = this.f177110g;
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
            this.f177107d.f177115v.f175487f.setImageDrawable(new BitmapDrawable(this.f177107d.getContext().getResources(), decodeStream));
            ((C54991o) this.f177107d.getBasePlugin().mo87696x0(cls)).f154254S2 = decodeStream;
        }
        String tag = this.f177107d.getTAG();
        Log.m105924i(tag, "liveCoverUrl:" + this.f177108e + ", avatarUrl:" + this.f177109f + ", choosePath:" + this.f177110g + ", business(LiveCommonSlice::class.java).audioModeHolderBm:" + ((C54991o) this.f177107d.getBasePlugin().mo87696x0(cls)).f154254S2);
        return C13598b0.f38549a;
    }
}
