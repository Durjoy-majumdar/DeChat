package vn3;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.p134kt.IntentTransfer;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sx3.C64197v;
import z04.C112550d0;

/* renamed from: vn3.c */
public final class C111559c {

    /* renamed from: a */
    public static final C111560a f333976a = new C111560a((C8480h) null);

    /* renamed from: b */
    public static final List<String> f333977b = C64197v.m75537f("RecordMsgDetailUI", "RecordMsgImageUI", "NoteEditorUI", "RecordMsgFileUI", "SelectConversationUI", "MsgRetransmitUI", "SnsUploadUI");

    /* renamed from: c */
    public static boolean f333978c = true;

    /* renamed from: vn3.c$a */
    public static final class C111560a {
        public C111560a(C8480h hVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x005f A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo163248a() {
            /*
                r5 = this;
                oa1.d r0 = oa1.C117731d.m166007c()
                java.lang.String r1 = "clicfg_vas_intent_wrapper_flag"
                r2 = 1
                r3 = 0
                int r0 = r0.mo182443e(r1, r2, r3, r3)
                if (r0 != r2) goto L_0x0010
                r0 = 1
                goto L_0x0011
            L_0x0010:
                r0 = 0
            L_0x0011:
                boolean r1 = vn3.C111559c.f333978c
                if (r1 == r0) goto L_0x0037
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "clicfg_vas_intent_wrapper_flag changed from "
                r1.append(r4)
                boolean r4 = vn3.C111559c.f333978c
                r1.append(r4)
                java.lang.String r4 = " to "
                r1.append(r4)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                java.lang.String r4 = "MicroMsg.VAS.VasNavigator"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
                vn3.C111559c.f333978c = r0
            L_0x0037:
                if (r0 != 0) goto L_0x0060
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r0 != 0) goto L_0x005b
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
                if (r0 != 0) goto L_0x004f
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
                if (r0 != 0) goto L_0x004f
                int r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT
                r1 = 788529167(0x2f00000f, float:1.1641553E-10)
                if (r0 != r1) goto L_0x004d
                goto L_0x004f
            L_0x004d:
                r0 = 0
                goto L_0x0050
            L_0x004f:
                r0 = 1
            L_0x0050:
                if (r0 != 0) goto L_0x005b
                boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
                if (r0 == 0) goto L_0x0059
                goto L_0x005b
            L_0x0059:
                r0 = 0
                goto L_0x005c
            L_0x005b:
                r0 = 1
            L_0x005c:
                if (r0 == 0) goto L_0x005f
                goto L_0x0060
            L_0x005f:
                r2 = 0
            L_0x0060:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: vn3.C111559c.C111560a.mo163248a():boolean");
        }

        /* renamed from: b */
        public final boolean mo163249b(Intent intent) {
            boolean z;
            ComponentName component = intent.getComponent();
            String className = component != null ? component.getClassName() : null;
            Iterator<String> it = C111559c.f333977b.iterator();
            do {
                z = false;
                if (!it.hasNext()) {
                    return false;
                }
                String next = it.next();
                if (className != null && C112550d0.m153801u(className, next, false)) {
                    z = true;
                    continue;
                }
            } while (!z);
            return true;
        }

        /* renamed from: c */
        public final void mo163250c(Intent intent, String str, String str2, String str3) {
            String str4 = str + '_' + str2;
            if (C87412m.m108589b(str3, "string")) {
                intent.putExtra(str, (String) IntentTransfer.Companion.pop(str4));
            } else if (C87412m.m108589b(str3, "byte[]")) {
                intent.putExtra(str, (byte[]) IntentTransfer.Companion.pop(str4));
            }
        }

        /* renamed from: d */
        public final void mo163251d(Intent intent) {
            C87412m.m108594g(intent, "intent");
            if (mo163248a() && mo163249b(intent)) {
                try {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        extras.setClassLoader(C111559c.class.getClassLoader());
                    }
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null) {
                        C111560a aVar = C111559c.f333976a;
                        ArrayList<String> stringArrayList = extras2.getStringArrayList("__transfer__");
                        if (stringArrayList != null) {
                            for (String str : stringArrayList) {
                                C87412m.m108593f(str, LocaleUtil.ITALIAN);
                                List U = C112550d0.m153785U(str, new String[]{","}, false, 0, 6, (Object) null);
                                if (U.size() == 3) {
                                    C111559c.f333976a.mo163250c(intent, (String) U.get(0), (String) U.get(1), (String) U.get(2));
                                    intent.removeExtra("__transfer__");
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.VAS.VasNavigator", th, "unWrap err", new Object[0]);
                }
            }
        }

        /* renamed from: e */
        public final void mo163252e(Intent intent) {
            Set<String> keySet;
            C87412m.m108594g(intent, "intent");
            if (mo163248a() && mo163249b(intent)) {
                ArrayList arrayList = new ArrayList();
                long nowMilliSecond = Util.nowMilliSecond();
                Bundle extras = intent.getExtras();
                if (!(extras == null || (keySet = extras.keySet()) == null)) {
                    for (String str : keySet) {
                        Bundle extras2 = intent.getExtras();
                        String str2 = null;
                        Object obj = extras2 != null ? extras2.get(str) : null;
                        C111560a aVar = C111559c.f333976a;
                        if ((obj instanceof String) && ((String) obj).length() > 307200) {
                            str2 = "string";
                        } else if ((obj instanceof byte[]) && ((byte[]) obj).length > 307200) {
                            str2 = "byte[]";
                        }
                        if (str2 != null) {
                            C87412m.m108593f(str, "key");
                            C87412m.m108591d(obj);
                            IntentTransfer.Companion.put(str + '_' + nowMilliSecond, obj);
                            intent.removeExtra(str);
                            arrayList.add(str + ',' + nowMilliSecond + ',' + str2);
                        }
                    }
                }
                C111560a aVar2 = C111559c.f333976a;
                intent.putExtra("__transfer__", arrayList);
            }
        }
    }
}
