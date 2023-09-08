package jq1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import eb0.C75592q0;
import er1.C58684b;
import gc0.C20828a;
import gy3.C87412m;
import ht1.C60166f;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import ky2.C10428a;
import o40.C61926c;
import t90.C13867d;
import te3.C64628pk1;
import te3.C64682rk1;

/* renamed from: jq1.b */
public final class C9489b extends C10428a {

    /* renamed from: jq1.b$a */
    public static final class C9490a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9489b f29660d;

        /* renamed from: e */
        public final /* synthetic */ C10428a.C10429a f29661e;

        /* renamed from: f */
        public final /* synthetic */ C64682rk1 f29662f;

        public C9490a(C9489b bVar, C10428a.C10429a aVar, C64682rk1 rk12) {
            this.f29660d = bVar;
            this.f29661e = aVar;
            this.f29662f = rk12;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/teenmode/FinderAuthorizationFiller$fillCellByWard$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9489b.m9169B(this.f29660d, this.f29661e, this.f29662f);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/teenmode/FinderAuthorizationFiller$fillCellByWard$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: B */
    public static final void m9169B(C9489b bVar, C10428a.C10429a aVar, C64682rk1 rk12) {
        bVar.getClass();
        Context context = aVar.f31653g.getContext();
        Intent intent = new Intent();
        intent.putExtra("feed_object_id", C61926c.m72671P(rk12.f185183d));
        intent.putExtra("feed_object_nonceId", rk12.f185191o);
        intent.putExtra("key_need_related_list", false);
        intent.putExtra("key_comment_scene", 25);
        if (rk12.f185188i == 11111) {
            intent.putExtra("business_type", 1);
        }
        C87412m.m108593f(context, "context");
        ((C58684b) C86312j.m106911c(C58684b.class)).Zx0(context, intent);
    }

    /* renamed from: D */
    public final void mo10174D(C10428a.C10429a aVar, C64682rk1 rk12, boolean z) {
        if (rk12 != null) {
            LinkedList<C64628pk1> linkedList = rk12.f185190n;
            if (linkedList != null) {
                if (!(!linkedList.isEmpty())) {
                    linkedList = null;
                }
                if (linkedList != null) {
                    C64628pk1 first = linkedList.getFirst();
                    C87412m.m108593f(first, "list.first");
                    C20828a.m22825b().mo32518g(first.f184828f, aVar.f31656j);
                }
            }
            aVar.f31658l.setText(rk12.f185187h);
            aVar.f31657k.setVisibility(0);
            if (z) {
                aVar.f31655i.setOnClickListener(new C9490a(this, aVar, rk12));
            }
        }
    }

    /* renamed from: d */
    public String mo10175d(Context context) {
        C87412m.m108594g(context, "context");
        String string = context.getString(C0966R.string.esc);
        C87412m.m108593f(string, "context.getString(com.te…dk.R.string.finder_title)");
        return string;
    }

    /* renamed from: q */
    public void mo10176q(Context context, C10428a.C10430b bVar, C10428a.C10429a aVar) {
        String str;
        C68070l.C68072b u;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "state");
        if (aVar != null) {
            C13867d dVar = (C13867d) aVar.f31647a.mo93555w(C13867d.class);
            boolean equals = C75592q0.m90789s().equals(aVar.f31652f);
            if (dVar != null) {
                LinkedList<C64628pk1> linkedList = null;
                Map<String, String> parseXml = XmlParser.parseXml(dVar.f39033e, "content", (String) null);
                if (parseXml != null && (str = parseXml.get(".content")) != null && (u = C68070l.C68072b.m80422u(str, (String) null)) != null) {
                    C60166f fVar = (C60166f) u.mo93555w(C60166f.class);
                    C64682rk1 rk12 = fVar != null ? fVar.f171710b : null;
                    Log.m105924i("FinderAuthorizationFiller", "onFill, state:" + bVar + ", isWard:" + equals + ", piece.referMsg:" + dVar.f39033e);
                    if (equals) {
                        Context context2 = aVar.f31653g.getContext();
                        int ordinal = bVar.ordinal();
                        if (ordinal == 0) {
                            aVar.f31654h.setText(context2.getResources().getString(C0966R.string.eri));
                            mo10174D(aVar, rk12, false);
                        } else if (ordinal == 1) {
                            aVar.f31654h.setText(context2.getResources().getString(C0966R.string.er_));
                            mo10174D(aVar, rk12, false);
                        } else if (ordinal == 2) {
                            aVar.f31654h.setText(context2.getResources().getString(C0966R.string.ere));
                            mo10174D(aVar, rk12, true);
                        } else if (ordinal == 3) {
                            aVar.f31654h.setText(context2.getResources().getString(C0966R.string.erc));
                            mo10174D(aVar, rk12, false);
                        }
                    } else {
                        Context context3 = aVar.f31653g.getContext();
                        int ordinal2 = bVar.ordinal();
                        if (ordinal2 == 0) {
                            aVar.f31653g.setText(context3.getResources().getString(C0966R.string.erh));
                            aVar.f31654h.setText(context3.getResources().getString(C0966R.string.erg));
                        } else if (ordinal2 == 1) {
                            aVar.f31654h.setText(context3.getResources().getString(C0966R.string.er_));
                        } else if (ordinal2 == 2) {
                            aVar.f31654h.setText(context3.getResources().getString(C0966R.string.erd));
                        } else if (ordinal2 == 3) {
                            aVar.f31654h.setText(context3.getResources().getString(C0966R.string.erb));
                        }
                        if (rk12 != null) {
                            LinkedList<C64628pk1> linkedList2 = rk12.f185190n;
                            if (linkedList2 != null) {
                                if (!linkedList2.isEmpty()) {
                                    linkedList = linkedList2;
                                }
                                if (linkedList != null) {
                                    C64628pk1 first = linkedList.getFirst();
                                    C87412m.m108593f(first, "list.first");
                                    C20828a.m22825b().mo32518g(first.f184828f, aVar.f31656j);
                                }
                            }
                            aVar.f31658l.setText(rk12.f185187h);
                            aVar.f31655i.setOnClickListener(new C9488a(this, aVar, rk12));
                            aVar.f31657k.setVisibility(0);
                        }
                    }
                }
            }
        }
    }
}
