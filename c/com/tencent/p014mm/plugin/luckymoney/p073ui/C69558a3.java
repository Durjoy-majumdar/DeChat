package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.model.C69248m2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import qe3.C77329i;
import te3.C77994sf2;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.a3 */
public class C69558a3 {

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.a3$a */
    public static class C69559a {

        /* renamed from: a */
        public C69561c f200850a;
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.a3$b */
    public static class C69560b {

        /* renamed from: a */
        public C69561c f200851a;
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.a3$c */
    public static final class C69561c {

        /* renamed from: a */
        public int f200852a = Integer.MIN_VALUE;

        /* renamed from: b */
        public int f200853b = Integer.MIN_VALUE;

        /* renamed from: c */
        public boolean f200854c = false;

        /* renamed from: d */
        public int f200855d = 0;

        /* renamed from: e */
        public int f200856e = 0;

        /* renamed from: f */
        public C77994sf2 f200857f;
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.a3$d */
    public static class C69562d {

        /* renamed from: a */
        public C69561c f200858a;
    }

    /* renamed from: a */
    public static void m81995a(Context context, ViewGroup viewGroup, C69248m2 m2Var, C69561c cVar) {
        if (m2Var != null) {
            m81996b(context, viewGroup, m2Var, cVar, m2Var.f199272f);
        }
    }

    /* renamed from: b */
    public static void m81996b(Context context, ViewGroup viewGroup, C69248m2 m2Var, C69561c cVar, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        C69248m2 m2Var2 = m2Var;
        C69561c cVar2 = cVar;
        String str2 = str;
        if (viewGroup2 != null && m2Var2 != null) {
            if (m2Var2.f199270d == 0) {
                Log.m105924i("MicroMsg.LuckyMoneyOperationViewMgr", "operInfo enable:" + m2Var2.f199270d);
                viewGroup2.setVisibility(8);
            } else if (!m2Var2.f199272f.equalsIgnoreCase(str2)) {
                Log.m105924i("MicroMsg.LuckyMoneyOperationViewMgr", "not match type:" + m2Var2.f199272f + ", " + str2);
                viewGroup2.setVisibility(8);
            } else if (str2.equalsIgnoreCase("Text") || str2.equalsIgnoreCase("Native")) {
                C69562d dVar = new C69562d();
                dVar.f200858a = cVar2;
                if (!Util.isNullOrNil(m2Var2.f199271e)) {
                    View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b_e, viewGroup2, true);
                    TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.gj_);
                    ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.gj9);
                    if (!Util.isNullOrNil(m2Var2.f199275i)) {
                        C69242l1.m81610p(imageView, m2Var2.f199275i, (String) null, false);
                        imageView.setVisibility(0);
                    } else {
                        imageView.setVisibility(8);
                    }
                    C69561c cVar3 = dVar.f200858a;
                    if (cVar3 == null || (i2 = cVar3.f200853b) == Integer.MIN_VALUE) {
                        textView.setTextSize(0, (float) context.getResources().getDimensionPixelSize(C0966R.dimen.f3881hq));
                    } else {
                        textView.setTextSize(0, (float) i2);
                    }
                    textView.setGravity(17);
                    textView.setText(m2Var2.f199271e);
                    if (!Util.isNullOrNil(m2Var2.f199273g)) {
                        textView.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.a1d));
                        textView.setOnClickListener(new C69577c3(dVar, m2Var2, context2));
                    }
                    C69561c cVar4 = dVar.f200858a;
                    if (!(cVar4 == null || (i = cVar4.f200852a) == Integer.MIN_VALUE)) {
                        textView.setTextColor(i);
                    }
                    viewGroup2.setVisibility(0);
                    C115669n.INSTANCE.mo160131h(11701, 14, 0, 0, 0, 1, Integer.valueOf(m2Var2.f199274h));
                    C69561c cVar5 = dVar.f200858a;
                    if (cVar5 != null) {
                        C77329i.m93195a(cVar5.f200855d, 0);
                    }
                }
            } else if (str2.equalsIgnoreCase("Pic")) {
                C69559a aVar = new C69559a();
                aVar.f200850a = cVar2;
                if (Util.isNullOrNil(m2Var2.f199271e)) {
                    Log.m105928w("MicroMsg.LuckyMoneyOperationViewMgr", "BannerPicOperationView attach iconUrl null");
                    viewGroup2.setVisibility(8);
                    return;
                }
                ImageView imageView2 = new ImageView(context2);
                imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                C69242l1.m81610p(imageView2, m2Var2.f199271e, (String) null, false);
                if (!Util.isNullOrNil(m2Var2.f199273g)) {
                    imageView2.setOnClickListener(new C69733z2(aVar, m2Var2, context2));
                }
                imageView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                viewGroup2.addView(imageView2);
                viewGroup2.setVisibility(0);
                C115669n.INSTANCE.mo160131h(11701, 14, 0, 0, 0, 1, Integer.valueOf(m2Var2.f199274h));
                C69561c cVar6 = aVar.f200850a;
                if (cVar6 != null) {
                    C77329i.m93195a(cVar6.f200855d, 0);
                }
            } else if (str2.equalsIgnoreCase("Appid")) {
                C69560b bVar = new C69560b();
                bVar.f200851a = cVar2;
                if (!Util.isNullOrNil(m2Var2.f199271e)) {
                    TextView textView2 = new TextView(context2);
                    C69561c cVar7 = bVar.f200851a;
                    if (cVar7 == null || (i4 = cVar7.f200852a) == Integer.MIN_VALUE) {
                        textView2.setTextColor(context.getResources().getColor(C0966R.color.ajd));
                    } else {
                        textView2.setTextColor(i4);
                    }
                    C69561c cVar8 = bVar.f200851a;
                    if (cVar8 == null || (i3 = cVar8.f200853b) == Integer.MIN_VALUE) {
                        textView2.setTextSize(0, (float) context.getResources().getDimensionPixelSize(C0966R.dimen.f3881hq));
                    } else {
                        textView2.setTextSize(0, (float) i3);
                    }
                    textView2.setGravity(17);
                    textView2.setText(m2Var2.f199271e);
                    if (!Util.isNullOrNil(m2Var2.f199273g)) {
                        textView2.setOnClickListener(new C69568b3(bVar, m2Var2, context2));
                    }
                    viewGroup2.addView(textView2, new ViewGroup.LayoutParams(-2, -2));
                    viewGroup2.setVisibility(0);
                    C115669n.INSTANCE.mo160131h(11701, 14, 0, 0, 0, 1, Integer.valueOf(m2Var2.f199274h));
                }
            }
        }
    }
}
