package ez2;

import ac2.C39535k;
import ac2.C91988j;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import az2.C39674e;
import b03.C39691c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import jq3.C60905o;
import p773yy.C66710j;
import qy2.C63347a;
import rz2.C48200b;
import rz2.C48201c;
import su0.C13781a;
import sz2.C48518b;
import uz2.C52678e0;

/* renamed from: ez2.i */
public final class C45729i<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C45733q f123567d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f123568e;

    /* renamed from: f */
    public final /* synthetic */ C48518b f123569f;

    public C45729i(C45733q qVar, C60905o oVar, C48518b bVar) {
        this.f123567d = qVar;
        this.f123568e = oVar;
        this.f123569f = bVar;
    }

    public void onChanged(Object obj) {
        String str;
        String str2;
        String str3;
        if (((C91988j) obj).f263327a == C39535k.UIRefresh) {
            C45733q qVar = this.f123567d;
            C60905o oVar = this.f123568e;
            C48518b bVar = this.f123569f;
            qVar.getClass();
            ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.c7p);
            imageView.setVisibility(0);
            ImageView imageView2 = (ImageView) oVar.mo85812D(C0966R.C0970id.fdj);
            TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.f359429kw2);
            if (IStatusIconHelperKt.m39109a().mo62279I()) {
                imageView2.setVisibility(8);
                textView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.f3550xf));
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart((int) qVar.f123581i);
                imageView.setLayoutParams(layoutParams2);
                ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
                C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.topMargin = (int) qVar.f123582j;
                textView.setLayoutParams(layoutParams4);
                textView.setTextSize(0, oVar.f173499A.getResources().getDimension(C0966R.dimen.f3684bd));
                str = null;
            } else {
                C85875k4.m106191k0(textView.getPaint());
                imageView2.setVisibility(0);
                if (IStatusIconHelperKt.m39109a().mo62311w()) {
                    String b = C48200b.m53529b(bVar.f129772d.f129193b.get(0));
                    C48201c cVar = qVar.f123585p;
                    if (!C87412m.m108589b(b, cVar != null ? C48200b.m53529b(cVar) : null)) {
                        HashMap hashMap = new HashMap();
                        for (C48201c cVar2 : bVar.f129772d.f129193b) {
                            String str4 = cVar2.field_IconID;
                            if (hashMap.containsKey(str4)) {
                                Integer num = (Integer) hashMap.get(str4);
                                C87412m.m108593f(str4, "iconId");
                                hashMap.put(str4, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                            } else {
                                C87412m.m108593f(str4, "iconId");
                                hashMap.put(str4, 1);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        int i = 0;
                        for (Map.Entry entry : hashMap.entrySet()) {
                            if (((Number) entry.getValue()).intValue() >= i) {
                                i = ((Number) entry.getValue()).intValue();
                                hashSet.add(entry.getKey());
                            }
                        }
                        if (hashSet.size() != 1) {
                            Iterator<T> it = bVar.f129772d.f129193b.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    str3 = C48200b.m53528a(bVar.f129772d.f129193b.get(0));
                                    break;
                                }
                                C48201c cVar3 = (C48201c) it.next();
                                if (hashSet.contains(cVar3.field_IconID)) {
                                    str3 = cVar3.field_IconID;
                                    break;
                                }
                            }
                        } else {
                            Iterator it4 = hashSet.iterator();
                            C87412m.m108593f(it4, "maxCountIconIdSet.iterator()");
                            str3 = it4.hasNext() ? (String) it4.next() : C48200b.m53528a(bVar.f129772d.f129193b.get(0));
                        }
                    } else {
                        str3 = qVar.f123585p.field_IconID;
                    }
                    if (str3 == null) {
                        str3 = C48200b.m53528a(bVar.f129772d.f129193b.get(0));
                    }
                } else {
                    str3 = C48200b.m53528a(bVar.f129772d.f129193b.get(0));
                }
                str = null;
                C39691c.m42340S(IStatusIconHelperKt.m39109a(), imageView2, str3, C63347a.C47893d.OUTLINED, C63347a.C47891b.FG_0, bVar.f129772d.f129193b.get(0), false, true, 32, (Object) null);
            }
            int size = bVar.f129772d.f129193b.size();
            if (size > 0) {
                C52678e0 a = C66710j.C53637a.m60171a(bVar.f129772d.f129193b.get(0), false, 1, str);
                C48201c n0 = C39674e.f106452d.mo62253n0(C13781a.m13082a());
                int i2 = C87412m.m108589b(C48200b.m53530c(a), n0 != null ? C48200b.m53529b(n0) : str) ? 1 : 2;
                if (IStatusIconHelperKt.m39109a().mo62279I()) {
                    long c = ((C31543z5.m39453c() / 1000) - ((long) bVar.f129772d.f129193b.get(0).field_CreateTime)) / ((long) 3600);
                    str2 = c < 1 ? oVar.f173499A.getResources().getString(C0966R.string.f361457mu2) : oVar.f173499A.getResources().getString(C0966R.string.m08, new Object[]{Long.valueOf(c)});
                } else {
                    str2 = IStatusIconHelperKt.m39109a().mo62275E() ? oVar.f173499A.getResources().getString(C0966R.string.k0e, new Object[]{Integer.valueOf(bVar.f129772d.f129193b.size())}) : IStatusIconHelperKt.m39109a().mo62291c(a, size, IStatusIconHelperKt.m39109a().mo62301m(a), i2);
                }
                C87412m.m108593f(str2, "if (getIconHelper().isTe…nfo), type)\n            }");
                if (str2.length() == 0) {
                    str2 = oVar.f173499A.getResources().getString(i2 == 1 ? C0966R.string.k0j : C0966R.string.k0g, new Object[]{Integer.valueOf(bVar.f129772d.f129193b.size()), IStatusIconHelperKt.m39109a().mo62301m(C66710j.C53637a.m60171a(bVar.f129772d.f129193b.get(0), false, 1, str))});
                    C87412m.m108593f(str2, "holder.context.resources…items[0].getTopicInfo()))");
                }
                textView.setText(str2);
            }
        }
    }
}
