package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import a14.C0000n0;
import a14.C53934p0;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import org.json.JSONObject;
import p606mm.C47080g;
import rx3.C13598b0;
import sr3.C118290c;
import sr3.C118296g;
import sr3.C118297h;
import sr3.C118298i;
import sr3.C13776l;
import sx3.C110818d0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C119027c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerXmlToJSONDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerXmlToJSONDemoUI */
public final class RepairerXmlToJSONDemoUI extends BaseRepairerUI {

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerXmlToJSONDemoUI$a */
    public static final class C5130a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerXmlToJSONDemoUI f20513d;

        public C5130a(RepairerXmlToJSONDemoUI repairerXmlToJSONDemoUI) {
            this.f20513d = repairerXmlToJSONDemoUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f20513d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerXmlToJSONDemoUI$b */
    public static final class C5131b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerXmlToJSONDemoUI f20514d;

        @C91590f(mo125468c = "com.tencent.mm.plugin.repairer.ui.demo.RepairerXmlToJSONDemoUI$onCreate$2$1", mo125469f = "RepairerXmlToJSONDemoUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerXmlToJSONDemoUI$b$a */
        public static final class C5132a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ String f20515d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5132a(String str, C15601d<? super C5132a> dVar) {
                super(2, dVar);
                this.f20515d = str;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C5132a(this.f20515d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C5132a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                String str;
                ResultKt.throwOnFailure(obj);
                try {
                    JSONObject a = C13776l.f38895a.mo13138a(this.f20515d);
                    if (a == null || (str = a.toString()) == null) {
                        str = "";
                    }
                    String format = String.format("xml_to_json_" + C31543z5.m39453c() + ".txt", Arrays.copyOf(new Object[0], 0));
                    C87412m.m108593f(format, "format(format, *args)");
                    byte[] bytes = str.getBytes(C119027c.f356488a);
                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                    ((C47080g) C86312j.m106911c(C47080g.class)).Kt0(format, bytes, true);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.Repairer.RepairerXmlToJSONDemo", e, "xml_to_json", new Object[0]);
                }
                return C13598b0.f38549a;
            }
        }

        public C5131b(RepairerXmlToJSONDemoUI repairerXmlToJSONDemoUI) {
            this.f20514d = repairerXmlToJSONDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerXmlToJSONDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LifecycleScope.launchDefault$default(this.f20514d.getUICScope(), (C53934p0) null, new C5132a(((MMEditText) this.f20514d.findViewById(C0966R.C0970id.lv7)).getText().toString(), (C15601d<? super C5132a>) null), 1, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerXmlToJSONDemoUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerXmlToJSONDemoUI$c */
    public static final class C5133c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerXmlToJSONDemoUI f20516d;

        @C91590f(mo125468c = "com.tencent.mm.plugin.repairer.ui.demo.RepairerXmlToJSONDemoUI$onCreate$3$1", mo125469f = "RepairerXmlToJSONDemoUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerXmlToJSONDemoUI$c$a */
        public static final class C5134a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ String f20517d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5134a(String str, C15601d<? super C5134a> dVar) {
                super(2, dVar);
                this.f20517d = str;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C5134a(this.f20517d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C5134a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                try {
                    String str = null;
                    try {
                        C118290c cVar = new C118290c(new C118296g(new StringReader(new JSONObject(this.f20517d).toString())));
                        Character ch = C118297h.f353550a;
                        str = C118297h.m166887e(cVar, (String) null, C118298i.f353559e);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.Json.XmlToJsonUtil", e, "toXml", new Object[0]);
                    }
                    if (str == null) {
                        str = "";
                    }
                    String format = String.format("json_to_xml_" + C31543z5.m39453c() + ".txt", Arrays.copyOf(new Object[0], 0));
                    C87412m.m108593f(format, "format(format, *args)");
                    byte[] bytes = str.getBytes(C119027c.f356488a);
                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                    ((C47080g) C86312j.m106911c(C47080g.class)).Kt0(format, bytes, true);
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.Repairer.RepairerXmlToJSONDemo", e2, "json_to_xml", new Object[0]);
                }
                return C13598b0.f38549a;
            }
        }

        public C5133c(RepairerXmlToJSONDemoUI repairerXmlToJSONDemoUI) {
            this.f20516d = repairerXmlToJSONDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerXmlToJSONDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LifecycleScope.launchDefault$default(this.f20516d.getUICScope(), (C53934p0) null, new C5134a(((MMEditText) this.f20516d.findViewById(C0966R.C0970id.lv7)).getText().toString(), (C15601d<? super C5134a>) null), 1, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerXmlToJSONDemoUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerXmlToJSONDemoUI$d */
    public static final class C5135d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ RepairerXmlToJSONDemoUI f20518d;

        @C91590f(mo125468c = "com.tencent.mm.plugin.repairer.ui.demo.RepairerXmlToJSONDemoUI$onCreate$4$1", mo125469f = "RepairerXmlToJSONDemoUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerXmlToJSONDemoUI$d$a */
        public static final class C5136a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ String f20519d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C5136a(String str, C15601d<? super C5136a> dVar) {
                super(2, dVar);
                this.f20519d = str;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C5136a(this.f20519d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C5136a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                try {
                    Map<String, String> parseXml = XmlParser.parseXml(this.f20519d, "msg", (String) null);
                    C87412m.m108593f(parseXml, "attrs");
                    ArrayList arrayList = new ArrayList(parseXml.size());
                    for (Map.Entry next : parseXml.entrySet()) {
                        arrayList.add(((String) next.getKey()) + '[' + ((String) next.getValue()) + ']');
                    }
                    String S = C110818d0.m150921S(arrayList, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
                    String format = String.format("MMXmlParser_" + C31543z5.m39453c() + ".txt", Arrays.copyOf(new Object[0], 0));
                    C87412m.m108593f(format, "format(format, *args)");
                    byte[] bytes = S.getBytes(C119027c.f356488a);
                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                    ((C47080g) C86312j.m106911c(C47080g.class)).Kt0(format, bytes, true);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.Repairer.RepairerXmlToJSONDemo", e, "mm_xml_parser", new Object[0]);
                }
                return C13598b0.f38549a;
            }
        }

        public C5135d(RepairerXmlToJSONDemoUI repairerXmlToJSONDemoUI) {
            this.f20518d = repairerXmlToJSONDemoUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerXmlToJSONDemoUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LifecycleScope.launchDefault$default(this.f20518d.getUICScope(), (C53934p0) null, new C5136a(((MMEditText) this.f20518d.findViewById(C0966R.C0970id.lv7)).getText().toString(), (C15601d<? super C5136a>) null), 1, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerXmlToJSONDemoUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bt8;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("微信XmlToJson");
        setBackBtn(new C5130a(this));
        findViewById(C0966R.C0970id.lv8).setOnClickListener(new C5131b(this));
        findViewById(C0966R.C0970id.fej).setOnClickListener(new C5133c(this));
        findViewById(C0966R.C0970id.gvn).setOnClickListener(new C5135d(this));
    }
}
