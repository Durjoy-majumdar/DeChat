package p628nx;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.component.UIComponentActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86301e;
import dm2.C45415a;
import dm2.C45422e;
import dm2.C45424g;
import dm2.C45425h;
import ei3.C86522b;
import gy3.C87412m;
import hm2.C46083a;
import java.util.Map;
import p640ox.C77049b;
import pe3.C47465a;

@C86522b
/* renamed from: nx.b */
public final class C47304b extends C86301e implements C77049b {
    /* JADX WARNING: type inference failed for: r6v7, types: [androidx.lifecycle.i0] */
    /* JADX WARNING: type inference failed for: r1v8, types: [dm2.g] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: AH */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends pe3.C47465a> void mo72345AH(int r6, android.view.View r7, T r8) {
        /*
            r5 = this;
            java.lang.Class<hm2.a> r0 = hm2.C46083a.class
            java.lang.String r1 = "convertView"
            gy3.C87412m.m108594g(r7, r1)
            java.lang.String r1 = "data"
            gy3.C87412m.m108594g(r8, r1)
            android.content.Context r1 = r7.getContext()
            java.lang.String r2 = "convertView.context"
            gy3.C87412m.m108593f(r1, r2)
            boolean r3 = r1 instanceof com.tencent.p014mm.p136ui.component.UIComponentActivity
            r4 = 0
            if (r3 == 0) goto L_0x0029
            bl3.r r3 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r1 = (androidx.appcompat.app.AppCompatActivity) r1
            bl3.r$a r1 = r3.mo62444c(r1)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r0)
            hm2.a r1 = (hm2.C46083a) r1
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            if (r1 == 0) goto L_0x0031
            dm2.g r1 = r1.mo71518c3(r6)
            goto L_0x0032
        L_0x0031:
            r1 = r4
        L_0x0032:
            if (r1 != 0) goto L_0x0062
            dm2.d r1 = new dm2.d
            r1.<init>(r6)
            android.content.Context r6 = r7.getContext()
            gy3.C87412m.m108593f(r6, r2)
            boolean r2 = r6 instanceof com.tencent.p014mm.p136ui.component.UIComponentActivity
            if (r2 == 0) goto L_0x0053
            bl3.r r2 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r6 = (androidx.appcompat.app.AppCompatActivity) r6
            bl3.r$a r6 = r2.mo62444c(r6)
            androidx.lifecycle.i0 r6 = r6.mo75002a(r0)
            r4 = r6
            hm2.a r4 = (hm2.C46083a) r4
        L_0x0053:
            if (r4 == 0) goto L_0x0062
            java.util.HashMap<java.lang.Integer, dm2.g<?>> r6 = r4.f124241g
            int r0 = r1.getType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.put(r0, r1)
        L_0x0062:
            int r6 = r7.hashCode()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r1.mo70916a(r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p628nx.C47304b.mo72345AH(int, android.view.View, pe3.a):void");
    }

    /* renamed from: DT */
    public <T extends C47465a> T mo72346DT(Context context, int i) {
        C87412m.m108594g(context, "context");
        C46083a aVar = context instanceof UIComponentActivity ? (C46083a) C39818r.f106831a.mo62444c((AppCompatActivity) context).mo75002a(C46083a.class) : null;
        if (aVar == null) {
            return null;
        }
        C45425h<?> e3 = aVar.mo71520e3(i);
        T c = e3 != null ? e3.mo70914c() : null;
        if (c instanceof C47465a) {
            return c;
        }
        return null;
    }

    /* renamed from: H6 */
    public <T extends C47465a> T mo72347H6(int i, View view) {
        C45424g c3;
        C87412m.m108594g(view, "view");
        Context context = view.getContext();
        C87412m.m108593f(context, "view.context");
        T t = null;
        C46083a aVar = context instanceof UIComponentActivity ? (C46083a) C39818r.f106831a.mo62444c((AppCompatActivity) context).mo75002a(C46083a.class) : null;
        Map b = (aVar == null || (c3 = aVar.mo71518c3(i)) == null) ? null : c3.mo70917b();
        int i2 = 0;
        if (b != null && b.containsKey(String.valueOf(view.hashCode()))) {
            return (C47465a) b.get(String.valueOf(view.hashCode()));
        }
        ViewParent parent = view.getParent();
        while (parent != null) {
            if (b != null && b.containsKey(String.valueOf(parent.hashCode()))) {
                break;
            }
            parent = parent.getParent();
        }
        if (b != null) {
            if (parent != null) {
                i2 = parent.hashCode();
            }
            t = (C47465a) b.get(String.valueOf(i2));
        }
        return t;
    }

    public UIComponent Hs0(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        return new C46083a(appCompatActivity);
    }

    public <T extends C47465a> void Kn0(Context context, C45424g<T> gVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(gVar, "secData");
        C46083a aVar = context instanceof UIComponentActivity ? (C46083a) C39818r.f106831a.mo62444c((AppCompatActivity) context).mo75002a(C46083a.class) : null;
        if (aVar != null) {
            aVar.f124241g.put(Integer.valueOf(gVar.getType()), gVar);
        }
    }

    public <T extends C47465a> C45424g<T> Lq0(Context context, int i) {
        C87412m.m108594g(context, "context");
        C46083a aVar = context instanceof UIComponentActivity ? (C46083a) C39818r.f106831a.mo62444c((AppCompatActivity) context).mo75002a(C46083a.class) : null;
        if (aVar != null) {
            return aVar.mo71518c3(i);
        }
        return null;
    }

    /* renamed from: Ok */
    public <T extends C47465a> T mo72351Ok(Context context, int i, Class<T> cls) {
        Class cls2 = C46083a.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cls, "clazz");
        C46083a aVar = context instanceof UIComponentActivity ? (C46083a) C39818r.f106831a.mo62444c((AppCompatActivity) context).mo75002a(cls2) : null;
        C45425h e3 = aVar != null ? aVar.mo71520e3(i) : null;
        if (e3 == null) {
            e3 = new C45422e(cls, i);
            C46083a aVar2 = context instanceof UIComponentActivity ? (C46083a) C39818r.f106831a.mo62444c((AppCompatActivity) context).mo75002a(cls2) : null;
            if (aVar2 != null) {
                aVar2.mo71522g3(e3);
            }
        }
        T c = e3.mo70914c();
        if (c instanceof C47465a) {
            return c;
        }
        return null;
    }

    /* renamed from: Rp */
    public <T extends C47465a> void mo72352Rp(Context context, C45425h<T> hVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(hVar, "secData");
        C46083a aVar = context instanceof UIComponentActivity ? (C46083a) C39818r.f106831a.mo62444c((AppCompatActivity) context).mo75002a(C46083a.class) : null;
        if (aVar != null) {
            aVar.mo71522g3(hVar);
        }
    }

    /* renamed from: Ru */
    public UIComponent mo72353Ru(Context context) {
        C87412m.m108594g(context, "context");
        if (context instanceof UIComponentActivity) {
            return (C46083a) C39818r.f106831a.mo62444c((AppCompatActivity) context).mo75002a(C46083a.class);
        }
        return null;
    }

    public <T extends C47465a> T Wi0(Context context, int i, Class<T> cls) {
        C45425h e3;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cls, "clazz");
        C46083a aVar = context instanceof UIComponentActivity ? (C46083a) C39818r.f106831a.mo62444c((AppCompatActivity) context).mo75002a(C46083a.class) : null;
        T c = (aVar == null || (e3 = aVar.mo71520e3(i)) == null) ? null : e3.mo70914c();
        if (c instanceof C47465a) {
            return c;
        }
        return null;
    }

    /* renamed from: fL */
    public Class<? extends UIComponent> mo72355fL() {
        return C46083a.class;
    }

    /* renamed from: fq */
    public <T extends C47465a> T mo72356fq(Context context, int i, int i2, Class<T> cls) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cls, "clazz");
        C46083a aVar = context instanceof UIComponentActivity ? (C46083a) C39818r.f106831a.mo62444c((AppCompatActivity) context).mo75002a(C46083a.class) : null;
        if (aVar != null) {
            return aVar.mo71519d3(i, i2, cls);
        }
        return null;
    }

    /* renamed from: nb */
    public <T extends C47465a> T mo72357nb(Context context, String str, int i, Class<T> cls) {
        Class cls2 = C46083a.class;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "activityName");
        C87412m.m108594g(cls, "clazz");
        C46083a aVar = context instanceof UIComponentActivity ? (C46083a) C39818r.f106831a.mo62444c((AppCompatActivity) context).mo75002a(cls2) : null;
        C45425h e3 = aVar != null ? aVar.mo71520e3(i) : null;
        if (e3 == null) {
            e3 = new C45415a(str, cls, i, false);
            C46083a aVar2 = context instanceof UIComponentActivity ? (C46083a) C39818r.f106831a.mo62444c((AppCompatActivity) context).mo75002a(cls2) : null;
            if (aVar2 != null) {
                aVar2.mo71522g3(e3);
            }
        }
        T c = e3.mo70914c();
        if (c instanceof C47465a) {
            return c;
        }
        return null;
    }

    /* renamed from: wi */
    public <T extends C47465a> T mo72358wi(Context context, int i, int i2, Class<T> cls) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cls, "clazz");
        C46083a aVar = context instanceof UIComponentActivity ? (C46083a) C39818r.f106831a.mo62444c((AppCompatActivity) context).mo75002a(C46083a.class) : null;
        if (aVar != null) {
            return aVar.mo71519d3(i, i2, cls);
        }
        return null;
    }
}
