package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.graphics.Paint;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WalletQueryAAStatusEvent;
import com.tencent.p014mm.message.C68062c;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.chatting.n0 */
public class C73760n0 {
    /* renamed from: a */
    public static String m87355a(CharSequence charSequence, CharSequence charSequence2, String str, Paint paint, int i) {
        String str2 = charSequence.toString() + charSequence2.toString();
        float measureText = paint.measureText(str2);
        if (i <= 0) {
            return str2;
        }
        float f = (float) i;
        if (measureText < f) {
            return str2;
        }
        String str3 = str + charSequence2;
        if (paint.measureText(str3) > f) {
            return str2;
        }
        String str4 = charSequence + str3;
        float measureText2 = paint.measureText(str4);
        int i2 = 1;
        while (measureText2 > f && i2 < 100 && i2 < charSequence.length()) {
            str4 = charSequence.subSequence(0, charSequence.length() - i2) + str3;
            measureText2 = paint.measureText(str4);
            i2++;
        }
        return str4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x008e, code lost:
        r10 = r1.f216519b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ad A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m87356b(com.tencent.p014mm.message.C68070l.C68072b r10, boolean r11) {
        /*
            r0 = -8868722(0xffffffffff78ac8e, float:-3.305445E38)
            if (r10 == 0) goto L_0x00b0
            int r1 = r10.f195644x1
            if (r1 > 0) goto L_0x000b
            goto L_0x00b0
        L_0x000b:
            java.lang.String r1 = r10.f195640w1
            com.tencent.mm.autogen.events.WalletQueryAAStatusEvent r2 = new com.tencent.mm.autogen.events.WalletQueryAAStatusEvent
            r2.<init>()
            com.tencent.mm.autogen.events.WalletQueryAAStatusEvent$a r3 = r2.f79053d
            r3.f79055a = r1
            r2.publish()
            com.tencent.mm.autogen.events.WalletQueryAAStatusEvent$b r1 = r2.f79054e
            int r1 = r1.f79056a
            r2 = 5
            r3 = 4
            r4 = -12479656(0xffffffffff419358, float:-2.5730606E38)
            if (r1 != r3) goto L_0x0029
            int r5 = r10.f195644x1
            if (r5 != r2) goto L_0x0029
            return r4
        L_0x0029:
            r5 = 3
            if (r1 == r5) goto L_0x00af
            r6 = 2
            if (r1 == r6) goto L_0x00af
            if (r1 != r3) goto L_0x0033
            goto L_0x00af
        L_0x0033:
            com.tencent.mm.ui.chatting.n0$a r1 = m87360f(r10)
            int r3 = r10.f195644x1
            r7 = 0
            r9 = 1
            if (r3 == r6) goto L_0x0085
            if (r3 == r5) goto L_0x0085
            if (r3 == r2) goto L_0x0044
            goto L_0x00ad
        L_0x0044:
            int r2 = r1.f216518a
            if (r2 == r9) goto L_0x0072
            if (r11 == 0) goto L_0x004b
            goto L_0x0072
        L_0x004b:
            if (r2 != r6) goto L_0x005c
            int r10 = r1.f216519b
            if (r10 <= 0) goto L_0x005b
            long r1 = r1.f216522e
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 < 0) goto L_0x005b
            if (r10 == r9) goto L_0x005a
            goto L_0x00ad
        L_0x005a:
            return r4
        L_0x005b:
            return r0
        L_0x005c:
            com.tencent.mm.ui.chatting.n0$a r11 = m87361g(r10)
            int r11 = r11.f216519b
            if (r11 <= 0) goto L_0x0071
            if (r11 == r9) goto L_0x006b
            if (r11 == r6) goto L_0x006b
            if (r11 == r5) goto L_0x006b
            goto L_0x00ad
        L_0x006b:
            boolean r10 = r10.f195474C1
            if (r10 == 0) goto L_0x0070
            return r0
        L_0x0070:
            return r4
        L_0x0071:
            return r0
        L_0x0072:
            int r10 = r1.f216519b
            if (r10 <= 0) goto L_0x0084
            int r11 = r1.f216520c
            if (r11 < 0) goto L_0x0084
            int r11 = r1.f216521d
            if (r11 < 0) goto L_0x0084
            if (r10 == r9) goto L_0x0083
            if (r10 == r6) goto L_0x0083
            goto L_0x00ad
        L_0x0083:
            return r4
        L_0x0084:
            return r0
        L_0x0085:
            int r10 = r1.f216518a
            if (r10 == r9) goto L_0x009d
            if (r11 == 0) goto L_0x008c
            goto L_0x009d
        L_0x008c:
            if (r10 != r6) goto L_0x009c
            int r10 = r1.f216519b
            if (r10 <= 0) goto L_0x009c
            long r1 = r1.f216522e
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 < 0) goto L_0x009c
            if (r10 == r9) goto L_0x009b
            goto L_0x00ad
        L_0x009b:
            return r4
        L_0x009c:
            return r0
        L_0x009d:
            int r10 = r1.f216519b
            if (r10 <= 0) goto L_0x00af
            int r11 = r1.f216520c
            if (r11 < 0) goto L_0x00af
            int r11 = r1.f216521d
            if (r11 < 0) goto L_0x00af
            if (r10 == r9) goto L_0x00ae
            if (r10 == r6) goto L_0x00ae
        L_0x00ad:
            return r0
        L_0x00ae:
            return r4
        L_0x00af:
            return r0
        L_0x00b0:
            java.lang.String r10 = "MicroMsg.C2CAppMsgUtil"
            java.lang.String r11 = "content == null || content.c2cNewAAType <= 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73760n0.m87356b(com.tencent.mm.message.l$b, boolean):int");
    }

    /* renamed from: c */
    public static float m87357c(C68070l.C68072b bVar, boolean z, boolean z2) {
        int i;
        if (bVar == null || bVar.f195644x1 <= 0) {
            Log.m105924i("MicroMsg.C2CAppMsgUtil", "content == null || content.c2cNewAAType <= 0");
            return 0.3f;
        }
        String str = bVar.f195640w1;
        WalletQueryAAStatusEvent walletQueryAAStatusEvent = new WalletQueryAAStatusEvent();
        walletQueryAAStatusEvent.f79053d.f79055a = str;
        walletQueryAAStatusEvent.publish();
        int i2 = walletQueryAAStatusEvent.f79054e.f79056a;
        if (i2 == 4 && bVar.f195644x1 == 5) {
            return z2 ? 0.5f : 0.8f;
        }
        if (!(i2 == 3 || i2 == 2 || i2 == 4)) {
            C73761a f = m87360f(bVar);
            int i3 = bVar.f195644x1;
            if (i3 == 2 || i3 == 3) {
                int i4 = f.f216518a;
                if (i4 == 1 || z) {
                    int i5 = f.f216519b;
                    if (i5 > 0 && f.f216520c >= 0 && f.f216521d >= 0) {
                        if (i5 == 1 || i5 == 2) {
                            return z2 ? 0.5f : 0.8f;
                        }
                    }
                } else if (i4 == 2 && (i = f.f216519b) > 0 && f.f216522e >= 0 && i == 1) {
                    return z2 ? 0.5f : 0.8f;
                }
            } else if (i3 == 5) {
                int i6 = f.f216518a;
                if (i6 == 1 || z) {
                    int i7 = f.f216519b;
                    if (i7 <= 0 || f.f216520c < 0 || f.f216521d < 0) {
                        return 0.3f;
                    }
                    if (i7 == 1 || i7 == 2) {
                        return z2 ? 0.5f : 0.8f;
                    }
                } else if (i6 == 2) {
                    int i8 = f.f216519b;
                    if (i8 > 0 && f.f216522e >= 0 && i8 == 1) {
                        return z2 ? 0.5f : 0.8f;
                    }
                } else {
                    int i9 = m87361g(bVar).f216519b;
                    if (i9 <= 0) {
                        return 0.3f;
                    }
                    if ((i9 == 1 || i9 == 2 || i9 == 3) && !bVar.f195474C1) {
                        return z2 ? 0.5f : 0.8f;
                    }
                    return 0.3f;
                }
            }
            return 0.3f;
        }
        return 0.3f;
    }

    /* renamed from: d */
    public static int m87358d(C68070l.C68072b bVar, boolean z) {
        if (bVar == null || bVar.f195644x1 <= 0) {
            Log.m105924i("MicroMsg.C2CAppMsgUtil", "content == null || content.c2cNewAAType <= 0");
            return z ? C0966R.C0969drawable.f4333k : C0966R.C0969drawable.f4331i;
        }
        String str = bVar.f195640w1;
        WalletQueryAAStatusEvent walletQueryAAStatusEvent = new WalletQueryAAStatusEvent();
        walletQueryAAStatusEvent.f79053d.f79055a = str;
        walletQueryAAStatusEvent.publish();
        int i = walletQueryAAStatusEvent.f79054e.f79056a;
        if (i == 4 && bVar.f195644x1 == 5) {
            return bVar.f195474C1 ? z ? C0966R.C0969drawable.f4333k : C0966R.C0969drawable.f4331i : z ? C0966R.C0969drawable.f4332j : C0966R.C0969drawable.f4330h;
        }
        if (i == 3 || i == 2 || i == 4) {
            return z ? C0966R.C0969drawable.f4333k : C0966R.C0969drawable.f4331i;
        }
        C73761a f = m87360f(bVar);
        int i2 = bVar.f195644x1;
        if (i2 == 2 || i2 == 3) {
            int i3 = f.f216518a;
            if (i3 == 1 || z) {
                int i4 = f.f216519b;
                if (i4 <= 0 || f.f216520c < 0 || f.f216521d < 0) {
                    return z ? C0966R.C0969drawable.f4333k : C0966R.C0969drawable.f4331i;
                }
                if (i4 == 1 || i4 == 2) {
                    return z ? C0966R.C0969drawable.f4332j : C0966R.C0969drawable.f4330h;
                }
                if (i4 == 3 || i4 == 4) {
                    return z ? C0966R.C0969drawable.f4333k : C0966R.C0969drawable.f4331i;
                }
            } else if (i3 != 2) {
                return i3 == 3 ? z ? C0966R.C0969drawable.f4333k : C0966R.C0969drawable.f4331i : z ? C0966R.C0969drawable.f4333k : C0966R.C0969drawable.f4331i;
            } else {
                int i5 = f.f216519b;
                if (i5 <= 0 || f.f216522e < 0) {
                    return z ? C0966R.C0969drawable.f4333k : C0966R.C0969drawable.f4331i;
                }
                if (i5 == 1) {
                    return z ? C0966R.C0969drawable.f4332j : C0966R.C0969drawable.f4330h;
                }
                if (i5 == 2 || i5 == 3 || i5 == 4) {
                    return z ? C0966R.C0969drawable.f4333k : C0966R.C0969drawable.f4331i;
                }
            }
        } else if (i2 == 5) {
            int i6 = f.f216518a;
            if (i6 == 1 || z) {
                int i7 = f.f216519b;
                if (i7 <= 0 || f.f216520c < 0 || f.f216521d < 0) {
                    return z ? C0966R.C0969drawable.f4333k : C0966R.C0969drawable.f4331i;
                }
                if (i7 == 1 || i7 == 2) {
                    return z ? C0966R.C0969drawable.f4332j : C0966R.C0969drawable.f4330h;
                }
                if (i7 == 3 || i7 == 4) {
                    return z ? C0966R.C0969drawable.f4333k : C0966R.C0969drawable.f4331i;
                }
            } else if (i6 == 2) {
                int i8 = f.f216519b;
                if (i8 <= 0 || f.f216522e < 0) {
                    return z ? C0966R.C0969drawable.f4333k : C0966R.C0969drawable.f4331i;
                }
                if (i8 == 1) {
                    return z ? C0966R.C0969drawable.f4332j : C0966R.C0969drawable.f4330h;
                }
                if (i8 == 2 || i8 == 3 || i8 == 4) {
                    return z ? C0966R.C0969drawable.f4333k : C0966R.C0969drawable.f4331i;
                }
            } else {
                int i9 = m87361g(bVar).f216519b;
                if (i9 <= 0) {
                    return z ? C0966R.C0969drawable.f4333k : C0966R.C0969drawable.f4331i;
                }
                if (i9 == 1 || i9 == 2 || i9 == 3) {
                    return bVar.f195474C1 ? z ? C0966R.C0969drawable.f4333k : C0966R.C0969drawable.f4331i : z ? C0966R.C0969drawable.f4332j : C0966R.C0969drawable.f4330h;
                }
                if (i9 == 4) {
                    return z ? C0966R.C0969drawable.f4333k : C0966R.C0969drawable.f4331i;
                }
            }
        }
        return z ? C0966R.C0969drawable.f4333k : C0966R.C0969drawable.f4331i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x009e A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m87359e(com.tencent.p014mm.message.C68070l.C68072b r11, boolean r12) {
        /*
            r0 = 2131755306(0x7f10012a, float:1.9141488E38)
            if (r11 == 0) goto L_0x00a2
            int r1 = r11.f195644x1
            if (r1 > 0) goto L_0x000b
            goto L_0x00a2
        L_0x000b:
            com.tencent.mm.ui.chatting.n0$a r1 = m87360f(r11)
            int r2 = r11.f195644x1
            r3 = 0
            r5 = 2131755305(0x7f100129, float:1.9141486E38)
            r6 = 2131755307(0x7f10012b, float:1.914149E38)
            r7 = 3
            r8 = 1
            r9 = 2
            if (r2 == r9) goto L_0x006f
            if (r2 == r7) goto L_0x006f
            r10 = 5
            if (r2 == r10) goto L_0x0025
            goto L_0x009e
        L_0x0025:
            int r2 = r1.f216518a
            if (r2 == r8) goto L_0x0059
            if (r12 == 0) goto L_0x002c
            goto L_0x0059
        L_0x002c:
            if (r2 != r9) goto L_0x0043
            int r11 = r1.f216519b
            if (r11 <= 0) goto L_0x0042
            long r1 = r1.f216522e
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 < 0) goto L_0x0042
            if (r11 == r8) goto L_0x0041
            if (r11 == r9) goto L_0x0040
            if (r11 == r7) goto L_0x0040
            goto L_0x009e
        L_0x0040:
            return r5
        L_0x0041:
            return r6
        L_0x0042:
            return r0
        L_0x0043:
            com.tencent.mm.ui.chatting.n0$a r12 = m87361g(r11)
            int r12 = r12.f216519b
            if (r12 <= 0) goto L_0x0058
            if (r12 == r8) goto L_0x0052
            if (r12 == r9) goto L_0x0052
            if (r12 == r7) goto L_0x0052
            goto L_0x009e
        L_0x0052:
            boolean r11 = r11.f195474C1
            if (r11 == 0) goto L_0x0057
            return r0
        L_0x0057:
            return r6
        L_0x0058:
            return r0
        L_0x0059:
            int r11 = r1.f216519b
            if (r11 <= 0) goto L_0x006e
            int r12 = r1.f216520c
            if (r12 < 0) goto L_0x006e
            int r12 = r1.f216521d
            if (r12 < 0) goto L_0x006e
            if (r11 == r8) goto L_0x006d
            if (r11 == r9) goto L_0x006d
            if (r11 == r7) goto L_0x006c
            goto L_0x009e
        L_0x006c:
            return r5
        L_0x006d:
            return r6
        L_0x006e:
            return r0
        L_0x006f:
            int r11 = r1.f216518a
            if (r11 == r8) goto L_0x008c
            if (r12 == 0) goto L_0x0076
            goto L_0x008c
        L_0x0076:
            if (r11 != r9) goto L_0x008b
            int r11 = r1.f216519b
            if (r11 <= 0) goto L_0x008b
            long r1 = r1.f216522e
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 < 0) goto L_0x008b
            if (r11 == r8) goto L_0x008a
            if (r11 == r9) goto L_0x0089
            if (r11 == r7) goto L_0x0089
            goto L_0x009e
        L_0x0089:
            return r5
        L_0x008a:
            return r6
        L_0x008b:
            return r0
        L_0x008c:
            int r11 = r1.f216519b
            if (r11 <= 0) goto L_0x00a1
            int r12 = r1.f216520c
            if (r12 < 0) goto L_0x00a1
            int r12 = r1.f216521d
            if (r12 < 0) goto L_0x00a1
            if (r11 == r8) goto L_0x00a0
            if (r11 == r9) goto L_0x00a0
            if (r11 == r7) goto L_0x009f
        L_0x009e:
            return r0
        L_0x009f:
            return r5
        L_0x00a0:
            return r6
        L_0x00a1:
            return r0
        L_0x00a2:
            java.lang.String r11 = "MicroMsg.C2CAppMsgUtil"
            java.lang.String r12 = "content == null || content.c2cNewAAType <= 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73760n0.m87359e(com.tencent.mm.message.l$b, boolean):int");
    }

    /* renamed from: f */
    public static C73761a m87360f(C68070l.C68072b bVar) {
        String s = C75592q0.m90789s();
        int i = bVar.f195644x1;
        if (i == 2 || i == 3 || i == 5) {
            if (!Util.isNullOrNil((List) bVar.f195466A1)) {
                Iterator it = ((ArrayList) bVar.f195466A1).iterator();
                while (it.hasNext()) {
                    String[] split = ((String) it.next()).split(",");
                    if (split.length == 4 && split[0].equals(s)) {
                        return new C73761a(1, Util.getInt(split[1], -1), Util.getInt(split[2], -1), Util.getInt(split[3], -1));
                    }
                }
            }
            if (!Util.isNullOrNil((List) bVar.f195470B1)) {
                Iterator it4 = ((ArrayList) bVar.f195470B1).iterator();
                while (it4.hasNext()) {
                    String[] split2 = ((String) it4.next()).split(",");
                    if (split2.length == 3 && split2[0].equals(s)) {
                        return new C73761a(2, Util.getInt(split2[2], -1), Util.getLong(split2[1], -1));
                    }
                }
            }
        }
        return new C73761a(3);
    }

    /* renamed from: g */
    public static C73761a m87361g(C68070l.C68072b bVar) {
        int i = bVar.f195644x1;
        if ((i == 2 || i == 3 || i == 5) && !Util.isNullOrNil((List) bVar.f195466A1)) {
            Iterator it = ((ArrayList) bVar.f195466A1).iterator();
            while (it.hasNext()) {
                String[] split = ((String) it.next()).split(",");
                if (split.length == 4) {
                    return new C73761a(1, Util.getInt(split[1], -1), Util.getInt(split[2], -1), Util.getInt(split[3], -1));
                }
            }
        }
        return new C73761a(3);
    }

    /* renamed from: h */
    public static String m87362h(C68070l.C68072b bVar, boolean z) {
        C68070l.C68072b bVar2 = bVar;
        if (bVar2 == null || bVar2.f195644x1 <= 0) {
            Log.m105924i("MicroMsg.C2CAppMsgUtil", "content == null || content.c2cNewAAType <= 0");
            return z ? bVar2.f195588j1 : bVar2.f195592k1;
        }
        C73761a f = m87360f(bVar);
        String str = bVar2.f195640w1;
        WalletQueryAAStatusEvent walletQueryAAStatusEvent = new WalletQueryAAStatusEvent();
        walletQueryAAStatusEvent.f79053d.f79055a = str;
        walletQueryAAStatusEvent.publish();
        int i = bVar2.f195644x1;
        if (i == 2 || i == 3) {
            int i2 = f.f216518a;
            if (i2 == 1 || z) {
                int i3 = f.f216519b;
                if (i3 <= 0 || f.f216520c < 0 || f.f216521d < 0) {
                    return MMApplicationContext.getContext().getString(C0966R.string.f7304c7);
                }
                if (i3 == 1) {
                    return MMApplicationContext.getContext().getString(C0966R.string.f7305c8);
                }
                if (i3 == 2) {
                    return MMApplicationContext.getContext().getString(C0966R.string.f7302c5, new Object[]{Integer.valueOf(f.f216520c - f.f216521d)});
                } else if (i3 == 3) {
                    return MMApplicationContext.getContext().getString(C0966R.string.f7300c2);
                } else {
                    if (i3 == 4) {
                        return MMApplicationContext.getContext().getString(C0966R.string.f7304c7);
                    }
                }
            } else if (i2 != 2) {
                return i2 == 3 ? MMApplicationContext.getContext().getString(C0966R.string.f7298c0) : MMApplicationContext.getContext().getString(C0966R.string.f7298c0);
            } else {
                int i4 = f.f216519b;
                if (i4 <= 0 || f.f216522e < 0) {
                    return MMApplicationContext.getContext().getString(C0966R.string.f7298c0);
                }
                if (i4 == 1) {
                    return MMApplicationContext.getContext().getString(C0966R.string.f7297bz, new Object[]{Float.valueOf(((float) f.f216522e) / 100.0f)});
                } else if (i4 == 2) {
                    return MMApplicationContext.getContext().getString(C0966R.string.f7296by, new Object[]{Float.valueOf(((float) f.f216522e) / 100.0f)});
                } else if (i4 == 3) {
                    return MMApplicationContext.getContext().getString(C0966R.string.f7299c1, new Object[]{Float.valueOf(((float) f.f216522e) / 100.0f)});
                } else if (i4 == 4) {
                    return MMApplicationContext.getContext().getString(C0966R.string.f7298c0);
                }
            }
        } else if (i == 5) {
            int i5 = f.f216518a;
            if (i5 == 1 || z) {
                int i6 = f.f216519b;
                if (i6 <= 0 || f.f216520c < 0 || f.f216521d < 0) {
                    return MMApplicationContext.getContext().getString(C0966R.string.f7304c7);
                }
                if (i6 == 1) {
                    return MMApplicationContext.getContext().getString(C0966R.string.f7305c8);
                }
                if (i6 == 2) {
                    return MMApplicationContext.getContext().getString(C0966R.string.f7303c6, new Object[]{Integer.valueOf(f.f216521d)});
                } else if (i6 == 3) {
                    return MMApplicationContext.getContext().getString(C0966R.string.f7300c2);
                } else {
                    if (i6 == 4) {
                        return MMApplicationContext.getContext().getString(C0966R.string.f7304c7);
                    }
                }
            } else if (i5 == 2) {
                int i7 = f.f216519b;
                if (i7 <= 0 || f.f216522e < 0) {
                    return MMApplicationContext.getContext().getString(C0966R.string.f7298c0);
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        return MMApplicationContext.getContext().getString(C0966R.string.f7296by, new Object[]{Float.valueOf(((float) f.f216522e) / 100.0f)});
                    } else if (i7 == 3) {
                        return MMApplicationContext.getContext().getString(C0966R.string.f7299c1, new Object[]{Float.valueOf(((float) f.f216522e) / 100.0f)});
                    } else if (i7 == 4) {
                        return MMApplicationContext.getContext().getString(C0966R.string.f7298c0);
                    }
                } else if (bVar2.f195474C1) {
                    return MMApplicationContext.getContext().getString(C0966R.string.muh);
                } else {
                    return MMApplicationContext.getContext().getString(C0966R.string.f7297bz, new Object[]{Float.valueOf(((float) f.f216522e) / 100.0f)});
                }
            } else {
                int i8 = m87361g(bVar).f216519b;
                if (i8 <= 0) {
                    return MMApplicationContext.getContext().getString(C0966R.string.f7298c0);
                }
                if (i8 == 1 || i8 == 2 || i8 == 3) {
                    return bVar2.f195474C1 ? MMApplicationContext.getContext().getString(C0966R.string.f7298c0) : MMApplicationContext.getContext().getString(C0966R.string.f7301c3);
                }
                if (i8 == 4) {
                    return MMApplicationContext.getContext().getString(C0966R.string.f7298c0);
                }
            }
        }
        return z ? bVar2.f195588j1 : bVar2.f195592k1;
    }

    /* renamed from: i */
    public static int m87363i(int i, int i2, boolean z) {
        return i == 5 ? z ? C0966R.C0969drawable.f4674jo : C0966R.C0969drawable.f4672jm : i == 4 ? z ? C0966R.C0969drawable.f4674jo : C0966R.C0969drawable.f4672jm : i == 3 ? i2 == 2 ? z ? C0966R.C0969drawable.f4674jo : C0966R.C0969drawable.f4672jm : z ? C0966R.C0969drawable.f4673jn : C0966R.C0969drawable.f4671jl : z ? C0966R.C0969drawable.f4673jn : C0966R.C0969drawable.f4671jl;
    }

    /* renamed from: j */
    public static String m87364j(int i, int i2, int i3, boolean z, boolean z2, String str, C68070l.C68072b bVar, TextView textView) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        String str2 = str;
        Class cls = C75339i.class;
        Context context = MMApplicationContext.getContext();
        C68062c cVar = (C68062c) bVar.mo93555w(C68062c.class);
        Log.m105919d("MicroMsg.C2CAppMsgUtil", "getC2CLuckyMoneyDescByHbStatus() hbType:%s hbStatus:%s receiveStatus:%s isGroupChat:%s exclusiveRecvUsername: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z2), cVar.f195397n);
        if (i5 == 5) {
            return context.getString(C0966R.string.gey);
        }
        if (i4 == 1) {
            return i5 == 4 ? i6 == 2 ? context.getString(C0966R.string.gez) : context.getString(C0966R.string.geu) : (i5 == 3 && i6 == 2) ? context.getString(C0966R.string.gez) : "";
        }
        if (i4 == 0) {
            return i5 == 4 ? z ? context.getString(C0966R.string.geu) : z2 ? i6 == 2 ? context.getString(C0966R.string.gez) : context.getString(C0966R.string.geu) : context.getString(C0966R.string.gez) : (i5 == 3 && !z && i6 == 2) ? context.getString(C0966R.string.gez) : "";
        }
        if (i4 == 3 && !Util.isNullOrNil(cVar.f195397n)) {
            String pb = ((C75339i) C86312j.m106911c(cls)).mo62519pb(cVar.f195397n, str2);
            if (i5 == 4) {
                return context.getString(C0966R.string.gex, new Object[]{pb});
            }
            String string = context.getString(C0966R.string.gev, new Object[]{pb});
            if (textView == null) {
                return string + context.getString(C0966R.string.gew);
            }
            int width = textView.getWidth();
            if (width <= 0) {
                width = C76577a.m92151b(MMApplicationContext.getContext(), 150);
            }
            return m87355a(string, context.getString(C0966R.string.gew), "...", textView.getPaint(), width);
        } else if (Util.isNullOrNil(cVar.f195397n)) {
            return i5 == 4 ? (!z2 || (z && i6 == 2)) ? context.getString(C0966R.string.gez) : context.getString(C0966R.string.geu) : (i5 == 3 && i6 == 2 && !z) ? context.getString(C0966R.string.gez) : "";
        } else {
            String pb4 = ((C75339i) C86312j.m106911c(cls)).mo62519pb(cVar.f195397n, str2);
            if (i5 == 4) {
                return context.getString(C0966R.string.gex, new Object[]{pb4});
            }
            String string2 = context.getString(C0966R.string.gev, new Object[]{pb4});
            if (textView == null) {
                return string2 + context.getString(C0966R.string.gew);
            }
            int width2 = textView.getWidth();
            if (width2 <= 0) {
                width2 = C76577a.m92151b(MMApplicationContext.getContext(), 150);
            }
            return m87355a(string2, context.getString(C0966R.string.gew), "...", textView.getPaint(), width2);
        }
    }

    /* renamed from: k */
    public static int m87365k(int i, int i2, boolean z) {
        return i == 5 ? z ? C0966R.C0969drawable.aem : C0966R.C0969drawable.f357255ae1 : i == 4 ? z ? C0966R.C0969drawable.aem : C0966R.C0969drawable.f357255ae1 : i == 3 ? i2 == 2 ? z ? C0966R.C0969drawable.aem : C0966R.C0969drawable.f357255ae1 : z ? C0966R.C0969drawable.ael : C0966R.C0969drawable.f357254ae0 : z ? C0966R.C0969drawable.ael : C0966R.C0969drawable.f357254ae0;
    }

    /* renamed from: l */
    public static int m87366l(int i, int i2, boolean z) {
        if (i == 5 || i == 4) {
            return C0966R.C0969drawable.c7y;
        }
        if (i == 3 && i2 == 2 && !z) {
            return C0966R.C0969drawable.c7y;
        }
        return -1;
    }

    /* renamed from: com.tencent.mm.ui.chatting.n0$a */
    public static class C73761a {

        /* renamed from: a */
        public int f216518a;

        /* renamed from: b */
        public int f216519b;

        /* renamed from: c */
        public int f216520c;

        /* renamed from: d */
        public int f216521d;

        /* renamed from: e */
        public long f216522e;

        public C73761a(int i, int i2, int i3, int i4) {
            this.f216522e = -1;
            this.f216518a = i;
            this.f216519b = i2;
            this.f216520c = i3;
            this.f216521d = i4;
        }

        public C73761a(int i, int i2, long j) {
            this.f216520c = -1;
            this.f216521d = -1;
            this.f216518a = i;
            this.f216519b = i2;
            this.f216522e = j;
        }

        public C73761a(int i) {
            this.f216520c = -1;
            this.f216521d = -1;
            this.f216522e = -1;
            this.f216518a = i;
        }
    }
}
