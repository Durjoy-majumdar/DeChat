package ib2;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import ib2.C60265a;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import kg3.C76577a;
import ma2.C61454t;
import nb2.C61645c0;
import p143ds.C58433i;
import p823sg.C90193h;
import z04.C119027c;

/* renamed from: ib2.b */
public final class C60268b extends C60896i<C60265a> {

    /* renamed from: e */
    public final C60269a f171828e;

    /* renamed from: ib2.b$a */
    public interface C60269a {
        /* renamed from: a */
        void mo80384a(int i, C60265a aVar);
    }

    public C60268b(C60269a aVar) {
        C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f171828e = aVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.bix;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C60905o oVar2 = oVar;
        C60265a aVar = (C60265a) cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(aVar, "item");
        MMRoundCornerImageView mMRoundCornerImageView = (MMRoundCornerImageView) oVar2.f44854d.findViewById(C0966R.C0970id.kk6);
        mMRoundCornerImageView.setRadius(C76577a.m92151b(oVar2.f173499A, 8));
        C60265a.C60266a aVar2 = aVar.f171816h;
        if (!Util.isNullOrNil(aVar2 != null ? aVar2.f171822c : null)) {
            C60265a.C60266a aVar3 = aVar.f171816h;
            if (aVar3 != null) {
                long j = aVar3.f171820a;
                if (-1 == j) {
                    C20937c.C20939b bVar = new C20937c.C20939b();
                    bVar.f59345a = true;
                    bVar.f59353i = 1;
                    C20828a.m22825b().mo32519h(aVar3.f171822c, mMRoundCornerImageView, bVar.mo32666a());
                } else {
                    long j2 = aVar3.f171821b;
                    C58433i iVar = (C58433i) C86312j.m106911c(C58433i.class);
                    String str = aVar3.f171822c;
                    if (str == null) {
                        str = "";
                    }
                    iVar.Eo0(mMRoundCornerImageView, 2, str, "", j, j2);
                }
            }
        } else {
            C60265a.C60267b bVar2 = aVar.f171817i;
            if (!Util.isNullOrNil(bVar2 != null ? bVar2.f171826a : null)) {
                C60265a.C60267b bVar3 = aVar.f171817i;
                String str2 = bVar3 != null ? bVar3.f171826a : null;
                C87412m.m108591d(str2);
                C61454t tVar = C61454t.f174766a;
                StringBuilder sb = new StringBuilder();
                sb.append("thumb_");
                byte[] bytes = str2.getBytes(C119027c.f356488a);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                sb.append(C90193h.m112878f(bytes));
                String i3 = new C86009m1(tVar.mo86430b(sb.toString())).mo119971i();
                C87412m.m108593f(i3, "VFSFile(MusicFileNameUti…Array())}\")).absolutePath");
                C20937c.C20939b bVar4 = new C20937c.C20939b();
                bVar4.f59346b = true;
                bVar4.f59345a = true;
                bVar4.f59350f = i3;
                Object[] objArr = new Object[1];
                C60265a.C60267b bVar5 = aVar.f171817i;
                objArr[0] = bVar5 != null ? bVar5.f171826a : null;
                bVar4.f59368x = objArr;
                C20828a b = C20828a.m22825b();
                C60265a.C60267b bVar6 = aVar.f171817i;
                b.mo32519h(bVar6 != null ? bVar6.f171826a : null, mMRoundCornerImageView, bVar4.mo32666a());
            }
        }
        WeImageView weImageView = (WeImageView) oVar2.f44854d.findViewById(C0966R.C0970id.c0a);
        weImageView.setVisibility(8);
        if (aVar.f171813e != 0) {
            weImageView.setVisibility(0);
        }
        weImageView.setOnClickListener(new C60270c(this, i, aVar));
        TextView textView = (TextView) oVar2.f44854d.findViewById(C0966R.C0970id.l5l);
        if (((long) aVar.f171818j) > 0) {
            textView.setVisibility(0);
            int i4 = aVar.f171818j;
            if (i4 < 0) {
                textView.setText("--:--");
            } else {
                int a = C61645c0.m72361a(i4);
                String valueOf = String.valueOf(a % 60);
                if (valueOf.length() < 2) {
                    valueOf = '0' + valueOf;
                }
                textView.setText((a / 60) + XVFSFile.PATH_SEPARATOR_CHAR + valueOf);
            }
        } else {
            textView.setVisibility(8);
        }
        int i5 = aVar.f171819n;
        if (i5 != -1) {
            oVar2.f44854d.setBackgroundResource(i5);
        } else {
            oVar2.f44854d.setBackground((Drawable) null);
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }
}
