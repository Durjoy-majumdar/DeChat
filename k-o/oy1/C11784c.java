package oy1;

import android.content.Context;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86009m1;
import gy3.C87412m;
import java.util.HashMap;
import ob0.C47350c;
import oy1.C11782b;
import pe3.C47465a;
import sw1.C48478n;
import ww1.C53212b;

/* renamed from: oy1.c */
public final class C11784c implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C11785d f34479a;

    /* renamed from: b */
    public final /* synthetic */ String f34480b;

    /* renamed from: c */
    public final /* synthetic */ Context f34481c;

    public C11784c(C11785d dVar, String str, Context context) {
        this.f34479a = dVar;
        this.f34480b = str;
        this.f34481c = context;
    }

    /* renamed from: a */
    public final void mo288a(int i, int i2, String str, C47350c cVar) {
        C47465a aVar;
        C11781a aVar2;
        if (i == 0 && i2 == 0 && (aVar = cVar.f127056b.f127083a) != null) {
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.videougc.AddWxagVideoResponse");
            C53212b bVar = (C53212b) aVar;
            String str2 = bVar.f148442g;
            if (!(str2 == null || str2.length() == 0)) {
                String str3 = bVar.f148442g;
                if (str3 == null) {
                    str3 = "";
                }
                C48478n.C13793h hVar = this.f34479a.f34482a;
                String str4 = this.f34480b;
                C87412m.m108594g(hVar, "videoFile");
                C87412m.m108594g(str4, "shareThumbUrl");
                if (C11782b.f34475a == null) {
                    C11782b.f34475a = new HashMap<>();
                }
                C11782b.C11783a aVar3 = new C11782b.C11783a(hVar, str3, str4);
                HashMap<String, C11782b.C11783a> hashMap = C11782b.f34475a;
                if (hashMap != null) {
                    C11782b.C11783a put = hashMap.put(MD5Util.getFileMD5String(new C86009m1(hVar.f38919c)), aVar3);
                }
                C11785d dVar = this.f34479a;
                int i3 = dVar.f34483b;
                if (i3 == 1) {
                    dVar.mo11684c(this.f34481c, str3, this.f34480b);
                } else if (i3 == 2) {
                    dVar.mo11685d(this.f34481c, str3, this.f34480b);
                } else if (i3 == 3 && (aVar2 = dVar.f34484c) != null) {
                    aVar2.mo11675b(str3, this.f34480b);
                }
            } else {
                Log.m105920e("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, doShareCgi failed share_url is null");
                C11781a aVar4 = this.f34479a.f34484c;
                if (aVar4 != null) {
                    aVar4.mo11674a("share_url is null");
                }
            }
        } else {
            Log.m105920e("MiniGameVideoShareProcessor", "gamelog.share , share video , upload, doShareCgi failed errType = " + i + " errCode = " + i2 + " errMsg = " + str + "  filePath = " + this.f34479a.f34482a.f38919c);
            C11781a aVar5 = this.f34479a.f34484c;
            if (aVar5 != null) {
                aVar5.mo11674a("doShareCgi error");
            }
        }
    }
}
