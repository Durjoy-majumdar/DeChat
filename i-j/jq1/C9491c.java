package jq1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import f40.C86709a0;
import gy3.C87412m;
import ky2.C10428a;
import lc3.C10485b;
import t90.C13867d;
import ts1.C14080d;
import up1.C37521f;

/* renamed from: jq1.c */
public final class C9491c extends C10428a {
    /* renamed from: d */
    public String mo10175d(Context context) {
        C87412m.m108594g(context, "context");
        String string = context.getString(C0966R.string.esc);
        C87412m.m108593f(string, "context.getString(com.te…dk.R.string.finder_title)");
        return string;
    }

    /* renamed from: q */
    public void mo10176q(Context context, C10428a.C10430b bVar, C10428a.C10429a aVar) {
        Class cls = C10485b.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "state");
        if (aVar != null) {
            aVar.f31655i.setVisibility(8);
            C13867d dVar = (C13867d) aVar.f31647a.mo93555w(C13867d.class);
            boolean equals = C75592q0.m90789s().equals(aVar.f31652f);
            StringBuilder sb = new StringBuilder();
            sb.append("onFill, state:");
            sb.append(bVar);
            sb.append(", type:");
            sb.append(dVar != null ? Integer.valueOf(dVar.f39032d) : null);
            sb.append(", isWard:");
            sb.append(equals);
            Log.m105924i("FinderLimitAuthorizationFiller", sb.toString());
            if (dVar != null) {
                int i = dVar.f39032d;
                if (i == 5) {
                    int i2 = 10;
                    if (equals) {
                        C37521f.f99374d.getClass();
                        if (!(C37521f.f99434j6.mo60266n().intValue() == 1)) {
                            i2 = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("FinderAntiAddictInterval", 2400);
                        }
                        int i3 = i2 / 60;
                        Context context2 = aVar.f31653g.getContext();
                        int ordinal = bVar.ordinal();
                        if (ordinal == 0) {
                            aVar.f31654h.setText(context2.getResources().getString(C0966R.string.er8, new Object[]{Integer.valueOf(i3), Integer.valueOf(i3)}));
                        } else if (ordinal == 1) {
                            aVar.f31654h.setText(context2.getResources().getString(C0966R.string.er_));
                        } else if (ordinal == 2) {
                            aVar.f31654h.setText(context2.getResources().getString(C0966R.string.er5, new Object[]{Integer.valueOf(i3), Integer.valueOf(i3)}));
                        } else if (ordinal == 3) {
                            aVar.f31654h.setText(context2.getResources().getString(C0966R.string.er4, new Object[]{Integer.valueOf(i3)}));
                        }
                    } else {
                        C37521f.f99374d.getClass();
                        if (!(C37521f.f99434j6.mo60266n().intValue() == 1)) {
                            i2 = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("FinderAntiAddictInterval", 2400);
                        }
                        int i4 = i2 / 60;
                        Context context3 = aVar.f31653g.getContext();
                        int ordinal2 = bVar.ordinal();
                        if (ordinal2 == 0) {
                            aVar.f31653g.setText(context3.getResources().getString(C0966R.string.era));
                            aVar.f31654h.setText(context3.getResources().getString(C0966R.string.er7, new Object[]{Integer.valueOf(i4), Integer.valueOf(i4)}));
                        } else if (ordinal2 == 1) {
                            aVar.f31654h.setText(context3.getResources().getString(C0966R.string.er_));
                        } else if (ordinal2 == 2) {
                            aVar.f31654h.setText(context3.getResources().getString(C0966R.string.er9, new Object[]{Integer.valueOf(i4)}));
                        } else if (ordinal2 == 3) {
                            aVar.f31654h.setText(context3.getResources().getString(C0966R.string.f360791er3, new Object[]{Integer.valueOf(i4)}));
                        }
                    }
                } else if (i == 6) {
                    if (equals) {
                        C14080d dVar2 = C14080d.f39488a;
                        int c = dVar2.mo13496c() / 60;
                        String str = dVar2.mo13495b() + ":00";
                        String str2 = '0' + dVar2.mo13494a() + ":00";
                        Context context4 = aVar.f31653g.getContext();
                        int ordinal3 = bVar.ordinal();
                        if (ordinal3 == 0) {
                            aVar.f31654h.setText(context4.getResources().getString(C0966R.string.f360790er2, new Object[]{str, str2, Integer.valueOf(c)}));
                        } else if (ordinal3 == 1) {
                            aVar.f31654h.setText(context4.getResources().getString(C0966R.string.er_));
                        } else if (ordinal3 == 2) {
                            aVar.f31654h.setText(context4.getResources().getString(C0966R.string.eqz, new Object[]{str, str2, str, Integer.valueOf(c)}));
                        } else if (ordinal3 == 3) {
                            aVar.f31654h.setText(context4.getResources().getString(C0966R.string.eqy, new Object[]{Integer.valueOf(c)}));
                        }
                    } else {
                        C14080d dVar3 = C14080d.f39488a;
                        int c2 = dVar3.mo13496c() / 60;
                        String str3 = dVar3.mo13495b() + ":00";
                        String str4 = '0' + dVar3.mo13494a() + ":00";
                        Context context5 = aVar.f31653g.getContext();
                        int ordinal4 = bVar.ordinal();
                        if (ordinal4 == 0) {
                            aVar.f31653g.setText(context5.getResources().getString(C0966R.string.era));
                            aVar.f31654h.setText(context5.getResources().getString(C0966R.string.f360789er1, new Object[]{str3, str4, Integer.valueOf(c2)}));
                        } else if (ordinal4 == 1) {
                            aVar.f31654h.setText(context5.getResources().getString(C0966R.string.er_));
                        } else if (ordinal4 == 2) {
                            aVar.f31654h.setText(context5.getResources().getString(C0966R.string.er9, new Object[]{Integer.valueOf(c2)}));
                        } else if (ordinal4 == 3) {
                            aVar.f31654h.setText(context5.getResources().getString(C0966R.string.eqx, new Object[]{str3, Integer.valueOf(c2)}));
                        }
                    }
                }
            }
        }
    }
}
