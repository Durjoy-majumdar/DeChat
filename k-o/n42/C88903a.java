package n42;

import android.content.DialogInterface;
import android.graphics.Color;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import e42.C7596h;
import e42.C86430i;
import gy3.C87412m;
import l42.C88381b;
import qo3.C77398g;

/* renamed from: n42.a */
public final class C88903a extends C86430i<C88381b> {

    /* renamed from: n42.a$a */
    public static final class C88904a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C88904a f256400d = new C88904a();

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: e */
    public String mo16e() {
        return "showModal";
    }

    /* renamed from: l */
    public boolean mo17l() {
        return true;
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        String optString = hVar.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        String optString2 = hVar.optString("content", "");
        String optString3 = hVar.optString("confirmText", "");
        String optString4 = hVar.optString("cancelText");
        boolean optBoolean = hVar.optBoolean("showCancel", true);
        String optString5 = hVar.optString("confirmColor");
        String optString6 = hVar.optString("cancelColor");
        C87412m.m108593f(optString, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        boolean z = false;
        if (optString.length() == 0) {
            C87412m.m108593f(optString2, "content");
            if (optString2.length() == 0) {
                z = true;
            }
            if (z) {
                mo120842g(1, "modal title and content null");
            }
        }
        C88381b bVar = (C88381b) this.f251227a;
        C77398g gVar = new C77398g(bVar != null ? bVar.mo8720e0() : null);
        gVar.mo107533r(optString2);
        gVar.setTitle((CharSequence) optString);
        gVar.mo107543y(Color.parseColor(optString5));
        gVar.mo107540u(Color.parseColor(optString6));
        gVar.mo107542x(optString3, true, C88904a.f256400d);
        if (optBoolean) {
            gVar.mo107539t(optString4, true, (DialogInterface.OnClickListener) null);
        }
        gVar.show();
        mo120844i();
    }
}
