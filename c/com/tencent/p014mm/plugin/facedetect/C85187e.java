package com.tencent.p014mm.plugin.facedetect;

import android.content.Context;
import android.content.res.AssetManager;
import com.davemorrissey.labs.subscaleview.view.ImageSource;
import com.tencent.p014mm.plugin.facedetect.model.C85191v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import hp3.C87581a;
import java.io.File;
import java.io.IOException;
import p564iq.C87789a;
import p564iq.C87790d;
import rd3.C48020a;

/* renamed from: com.tencent.mm.plugin.facedetect.e */
public class C85187e implements C87581a<Void, Void> {

    /* renamed from: com.tencent.mm.plugin.facedetect.e$a */
    public class C85188a implements C87789a {

        /* renamed from: a */
        public final /* synthetic */ String f248187a;

        /* renamed from: b */
        public final /* synthetic */ String f248188b;

        public C85188a(C85187e eVar, String str, String str2) {
            this.f248187a = str;
            this.f248188b = str2;
        }

        /* renamed from: a */
        public void mo118204a(AssetManager assetManager) {
            String q = C86013q1.m106456q(this.f248187a);
            String xY = ((C87790d) C86312j.m106911c(C87790d.class)).mo122044xY(assetManager, this.f248188b);
            Log.m105924i("MicroMsg.TaskInitFace", "localMD5 : " + q);
            Log.m105924i("MicroMsg.TaskInitFace", "assetMD5 : " + xY);
            if (q == null || q.equals(xY)) {
                Log.m105925i("MicroMsg.TaskInitFace", "sdPath:%s   exists ", this.f248187a);
                return;
            }
            C86013q1.m106447h(this.f248187a);
            Log.m105924i("MicroMsg.TaskInitFace", this.f248187a + " md5 is wrong");
            C85187e.m105057c(MMApplicationContext.getContext(), this.f248188b, this.f248187a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.e$b */
    public class C85189b implements C87789a {

        /* renamed from: a */
        public final /* synthetic */ String f248189a;

        /* renamed from: b */
        public final /* synthetic */ String f248190b;

        public C85189b(String str, String str2) {
            this.f248189a = str;
            this.f248190b = str2;
        }

        /* renamed from: a */
        public void mo118204a(AssetManager assetManager) {
            try {
                ((C87790d) C86312j.m106911c(C87790d.class)).mo122036Xk(assetManager, this.f248189a, new File(this.f248190b));
            } catch (IOException e) {
                Log.m105928w("MicroMsg.TaskInitFace", "copy assets from expansions file error, e = " + e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public static void m105056b(C85187e eVar, String str, String str2) {
        eVar.getClass();
        if (!C48020a.m53385b(str)) {
            Log.m105925i("MicroMsg.TaskInitFace", "alvinluo copy detect model file detector: %s", str);
            m105057c(MMApplicationContext.getContext(), str2, str);
            return;
        }
        eVar.mo118221d(str, str2);
    }

    /* renamed from: c */
    public static void m105057c(Context context, String str, String str2) {
        Class cls = C87790d.class;
        if (!((C87790d) C86312j.m106911c(cls)).mo122037ZY("face_detect")) {
            C85191v.m105065d(context, str, str2);
        } else {
            ((C87790d) C86312j.m106911c(cls)).vr0(new C85189b(str, str2));
        }
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        Log.m105924i("MicroMsg.TaskInitFace", "hy: TaskInitFace init");
        ThreadPool.post(new C85186d(this, new String[]{"net1_18.rpnmodel", "net1_18_bin.rpnproto", "net2_36.rpnmodel", "net2_36_bin.rpnproto"}, C85191v.m105070i() + "/", new String[]{"align.rpdm", "align.stb", "align_bin.rpdc", "eye.rpdm", "eye_bin.rpdc"}, new String[]{"rotBasis.bin"}), "FaceReflectCopyModelFile");
        return null;
    }

    /* renamed from: d */
    public final void mo118221d(String str, String str2) {
        Class cls = C87790d.class;
        if (!((C87790d) C86312j.m106911c(cls)).mo122037ZY("face_detect")) {
            String q = C86013q1.m106456q(str);
            String q2 = C86013q1.m106456q(ImageSource.ASSET_SCHEME + str2);
            Log.m105924i("MicroMsg.TaskInitFace", "localMD5 : " + q);
            Log.m105924i("MicroMsg.TaskInitFace", "assetMD5 : " + q2);
            if (q == null || q.equals(q2)) {
                Log.m105925i("MicroMsg.TaskInitFace", "SDPath:%s   exists ", str);
                return;
            }
            C86013q1.m106447h(str);
            Log.m105924i("MicroMsg.TaskInitFace", str + " md5 is wrong");
            C85191v.m105065d(MMApplicationContext.getContext(), str2, str);
            return;
        }
        ((C87790d) C86312j.m106911c(cls)).vr0(new C85188a(this, str, str2));
    }
}
