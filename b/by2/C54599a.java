package by2;

import android.graphics.Bitmap;
import ay2.C67121f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import ey2.C58854c;
import ey2.C75665a;
import gy3.C87412m;
import java.util.ArrayList;
import kg3.C76577a;
import p008bq.C54532p1;
import p262wm.C22923f;

/* renamed from: by2.a */
public final class C54599a extends C58854c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54599a(C58854c.C58855a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "callback");
    }

    /* renamed from: a */
    public int mo75502a(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "data");
        return multiTaskInfo.field_type == 4 ? C0966R.C0969drawable.ccw : C0966R.C0969drawable.ccz;
    }

    /* renamed from: b */
    public String mo75503b(MultiTaskInfo multiTaskInfo) {
        if (multiTaskInfo == null) {
            return "";
        }
        if (multiTaskInfo.field_type == 4) {
            String q = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.f7897vi);
            C87412m.m108593f(q, "getString(MMApplicationC…ar_section_subtitle_file)");
            return q;
        }
        String q2 = C76577a.m92166q(MMApplicationContext.getContext(), C0966R.string.f7901vm);
        C87412m.m108593f(q2, "getString(MMApplicationC…ar_section_subtitle_note)");
        return q2;
    }

    /* renamed from: c */
    public void mo75504c(C75665a.C58851b bVar) {
        C87412m.m108594g(bVar, "viewHolder");
        bVar.f168472A.setImageBitmap((Bitmap) null);
    }

    /* renamed from: d */
    public void mo75505d(int i, C75665a.C58851b bVar, C67121f fVar) {
        C87412m.m108594g(bVar, "viewHolder");
        C87412m.m108594g(fVar, "viewModel");
        super.mo75505d(i, bVar, fVar);
        if (((MultiTaskInfo) ((ArrayList) fVar.f192729d).get(i)).field_type == 4) {
            ((C22923f) C86312j.m106911c(C22923f.class)).mo35908u8(((MultiTaskInfo) ((ArrayList) fVar.f192729d).get(i)).mo80305m2().f183755h);
        }
        bVar.f168473B.setText(((C54532p1) C86312j.m106911c(C54532p1.class)).mo55776j().mo75395M(bVar.f44854d.getContext(), ((MultiTaskInfo) ((ArrayList) fVar.f192729d).get(i)).mo80305m2().f183752e));
    }
}
