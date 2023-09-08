package com.tencent.p014mm.plugin.game.model;

import a70.C112760b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import java.io.IOException;
import p823sg.C90193h;
import sf0.C101592a0;

/* renamed from: com.tencent.mm.plugin.game.model.n0 */
public class C69019n0 implements C101592a0 {

    /* renamed from: a */
    public String f198341a;

    public C69019n0(String str) {
        this.f198341a = str;
        Uri n = C116299g2.m163858n(C112760b.m154253y());
        String path = n.getPath();
        boolean z = false;
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(l.mo177810a() ? l.f348991a.mo119948x(l.f348992b) : z)) {
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
        }
    }

    /* renamed from: a */
    public String mo94817a() {
        return this.f198341a.hashCode() + "";
    }

    /* renamed from: b */
    public C101592a0.C101593b mo94818b() {
        return null;
    }

    /* renamed from: c */
    public Bitmap mo94819c(Bitmap bitmap, C101592a0.C77686a aVar, String str) {
        if (C101592a0.C77686a.DISK == aVar) {
            return bitmap;
        }
        try {
            BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.PNG, mo94827k(), false);
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.GetGamePicStrategy", e, "", new Object[0]);
        }
        return bitmap;
    }

    /* renamed from: d */
    public String mo94820d() {
        return this.f198341a.hashCode() + "";
    }

    /* renamed from: e */
    public Bitmap mo94821e() {
        return BitmapFactory.decodeResource(MMApplicationContext.getContext().getResources(), C0966R.C0969drawable.bis);
    }

    /* renamed from: f */
    public void mo94822f() {
    }

    /* renamed from: g */
    public String mo94823g() {
        return this.f198341a;
    }

    /* renamed from: h */
    public boolean mo94824h() {
        return false;
    }

    /* renamed from: i */
    public void mo94825i(C101592a0.C77686a aVar, String str) {
    }

    /* renamed from: j */
    public void mo94826j(String str, boolean z) {
    }

    /* renamed from: k */
    public String mo94827k() {
        return C112760b.m154253y() + C90193h.m112878f(this.f198341a.getBytes());
    }

    /* renamed from: l */
    public boolean mo94828l() {
        return true;
    }
}
