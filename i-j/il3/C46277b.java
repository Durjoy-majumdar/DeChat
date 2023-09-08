package il3;

import android.database.Cursor;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.GetConvEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.file.XVFSFile;
import d62.C75339i;
import di3.C86301e;
import di3.C86312j;
import eb0.C45612m0;
import eb0.C97625j3;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import he0.C76158j;
import i61.C98602h;
import java.util.ArrayList;
import kg3.C76577a;
import kr0.C34010q0;
import p629ny.C76979h;
import p875ci.C67379u;
import z51.C39315g;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: il3.b */
public class C46277b extends C86301e implements C34010q0 {
    public final String Ax0(C72976h2 h2Var) {
        if (Util.isNullOrNil(h2Var.mo108822p2())) {
            return "";
        }
        if (Util.isNullOrNil(h2Var.mo108823q2())) {
            return h2Var.mo108822p2();
        }
        Class cls = C75339i.class;
        int i = 1;
        try {
            return String.format(h2Var.mo108822p2(), new Object[]{(h2Var.mo108832y2() != 0 || !C72996z1.m85820U5(h2Var.getUsername())) ? ((C75339i) C86312j.m106911c(cls)).getDisplayName(h2Var.mo108823q2()) : ((C75339i) C86312j.m106911c(cls)).mo62519pb(h2Var.mo108823q2(), h2Var.getUsername())});
        } catch (Exception unused) {
            int y2 = h2Var.mo108832y2();
            String username = h2Var.getUsername();
            String content = h2Var.getContent();
            String B2 = h2Var.mo108781B2();
            if (B2 != null && B2.length() > 0) {
                try {
                    i = Integer.valueOf(B2).intValue();
                } catch (NumberFormatException unused2) {
                }
            }
            return C67379u.m79745j(y2, username, content, i, MMApplicationContext.getContext());
        }
    }

    public void Bx0(C72976h2 h2Var, C72976h2 h2Var2) {
        String str;
        C72976h2 zx02 = zx0();
        if (zx02 == null || TextUtils.isEmpty(zx02.mo108822p2())) {
            h2Var.mo108794O2(MMApplicationContext.getContext().getString(C0966R.string.bv5));
            return;
        }
        SpannableString xx02 = xx0(zx02);
        if (zx02.mo108781B2() != null && (zx02.mo108781B2().equals(String.valueOf(47)) || zx02.mo108781B2().equals(String.valueOf(1048625)))) {
            str = yx0(zx02);
        } else if (zx02.mo108822p2() == null || !zx02.mo108822p2().contains(XVFSFile.PATH_SEPARATOR)) {
            str = Ax0(zx02);
        } else {
            str = zx02.mo108822p2().substring(zx02.mo108822p2().indexOf(XVFSFile.PATH_SEPARATOR) + 1).replace(" ", "").replace("\n", "");
            h2Var.mo108794O2(MMApplicationContext.getContext().getString(C0966R.string.bv6, new Object[]{xx02, str}));
        }
        h2Var.mo108794O2(MMApplicationContext.getContext().getString(C0966R.string.bv6, new Object[]{xx02, str}));
        C72963f4 f4Var = new C72963f4();
        try {
            f4Var.setType(Integer.parseInt(h2Var2.mo108781B2()));
        } catch (Exception unused) {
        }
        if (f4Var.mo101019v3()) {
            h2Var.mo108812g3(0);
        } else {
            h2Var.mo108812g3(wx0());
        }
    }

    public void Ga0(C44661m1 m1Var, C72976h2 h2Var, String str, String str2) {
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (z1Var != null) {
            z1Var.setType(z1Var.getType() | 268435456);
            C45612m0.m50679F(str, m1Var, 1, z1Var);
            X10(h2Var, false, true);
            Log.m105925i("MicroMsg.ConvBoxConversationService", "conversation:%s , add to conv box :%s %s", str, true, h2Var.mo108782C2());
        }
    }

    public void X10(C72976h2 h2Var, boolean z, boolean z2) {
        Class cls = C75700k0.class;
        if (h2Var != null && z2) {
            h2Var.mo108807c3("conversationboxservice");
            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69773k0(h2Var, h2Var.getUsername());
        }
        C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j("conversationboxservice");
        String str = "";
        if (j == null) {
            Log.m105924i("MicroMsg.ConvBoxConversationService", "create parentConv");
            C72976h2 h2Var2 = new C72976h2("conversationboxservice");
            h2Var2.mo101162m3();
            if (h2Var != null) {
                Bx0(h2Var2, h2Var);
            }
            if (h2Var != null) {
                str = h2Var.getUsername();
            }
            GetConvEvent getConvEvent = new GetConvEvent();
            GetConvEvent.C40118a aVar = getConvEvent.f107586d;
            aVar.f107589b = str;
            aVar.f107590c = 0;
            aVar.f107588a = new C21106a(this, h2Var2, false);
            getConvEvent.asyncPublish(Looper.getMainLooper());
            return;
        }
        Log.m105924i("MicroMsg.ConvBoxConversationService", "ConvBox SuperConv is created");
        j.mo108807c3((String) null);
        if (h2Var != null) {
            Bx0(j, h2Var);
        }
        if (z) {
            if (h2Var != null) {
                str = h2Var.getUsername();
            }
            GetConvEvent getConvEvent2 = new GetConvEvent();
            GetConvEvent.C40118a aVar2 = getConvEvent2.f107586d;
            aVar2.f107589b = str;
            aVar2.f107590c = 0;
            aVar2.f107588a = new C21106a(this, j, true);
            getConvEvent2.asyncPublish(Looper.getMainLooper());
            return;
        }
        ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69773k0(j, "conversationboxservice");
    }

    /* renamed from: a7 */
    public void mo59402a7(C72976h2 h2Var) {
        if (h2Var != null) {
            h2Var.mo108807c3((String) null);
            ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69773k0(h2Var, h2Var.getUsername());
            int nj02 = nj0();
            if (nj02 == 0) {
                ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f("conversationboxservice");
            } else {
                mo59405u9(false);
            }
            Log.m105925i("MicroMsg.ConvBoxConversationService", "updateForChildConversationUnSet childCvs:%s convBoxCnt:%s", h2Var.getUsername(), Integer.valueOf(nj02));
        }
    }

    /* renamed from: bN */
    public void mo59403bN(C44661m1 m1Var, C72976h2 h2Var, String str, String str2) {
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (z1Var != null) {
            z1Var.setType(z1Var.getType() & -268435457);
            boolean z = false;
            C45612m0.m50679F(str, m1Var, 0, z1Var);
            mo59402a7(h2Var);
            Object[] objArr = new Object[3];
            objArr[0] = str;
            if (z1Var.mo62938w3()) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            objArr[2] = h2Var.mo108782C2();
            Log.m105925i("MicroMsg.ConvBoxConversationService", "conversation:%s, del from conv box :%s %s", objArr);
        }
    }

    /* JADX INFO: finally extract failed */
    public int nj0() {
        int i;
        Cursor I = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69738I(5, new ArrayList(), "conversationboxservice", -1);
        int i2 = 0;
        try {
            if (I.moveToFirst()) {
                i = 0;
                do {
                    i++;
                    try {
                    } catch (Exception e) {
                        e = e;
                        try {
                            Log.printErrStackTrace("MicroMsg.ConvBoxConversationService", e, "getConvBoxCount", new Object[0]);
                            I.close();
                            return i;
                        } catch (Throwable th) {
                            I.close();
                            throw th;
                        }
                    }
                } while (I.moveToNext());
                i2 = i;
            }
            I.close();
            return i2;
        } catch (Exception e2) {
            e = e2;
            i = 0;
            Log.printErrStackTrace("MicroMsg.ConvBoxConversationService", e, "getConvBoxCount", new Object[0]);
            I.close();
            return i;
        }
    }

    /* renamed from: u9 */
    public void mo59405u9(boolean z) {
        String str;
        Class cls = C75700k0.class;
        C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j("conversationboxservice");
        if (j != null) {
            C72976h2 zx02 = zx0();
            if (zx02 == null || TextUtils.isEmpty(zx02.mo108822p2())) {
                j.mo108794O2(MMApplicationContext.getContext().getString(C0966R.string.bv5));
            } else {
                int wx02 = wx0();
                if (z) {
                    j.mo108817i3(wx02);
                    j.mo108812g3(wx02);
                }
                SpannableString xx02 = xx0(zx02);
                if (zx02.mo108781B2() != null && (zx02.mo108781B2().equals(String.valueOf(47)) || zx02.mo108781B2().equals(String.valueOf(1048625)))) {
                    str = yx0(zx02);
                } else if (zx02.mo108822p2() == null || !zx02.mo108822p2().contains(XVFSFile.PATH_SEPARATOR)) {
                    str = Ax0(zx02);
                } else {
                    str = zx02.mo108822p2().substring(zx02.mo108822p2().indexOf(XVFSFile.PATH_SEPARATOR) + 1).replace(" ", "").replace("\n", "");
                    j.mo108794O2(MMApplicationContext.getContext().getString(C0966R.string.bv6, new Object[]{xx02, str}));
                }
                j.mo108794O2(MMApplicationContext.getContext().getString(C0966R.string.bv6, new Object[]{xx02, str}));
            }
            ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69773k0(j, "conversationboxservice");
        }
    }

    public final String vx0(String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138012T(str);
    }

    public int wx0() {
        Cursor I = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69738I(5, new ArrayList(), "conversationboxservice", -1);
        int i = 0;
        if (I.moveToFirst()) {
            do {
                C72976h2 h2Var = new C72976h2();
                h2Var.convertFrom(I);
                if (!(h2Var.mo108786G2() == 0 && h2Var.mo108788I2() == 0)) {
                    i++;
                }
            } while (I.moveToNext());
        }
        I.close();
        return i;
    }

    public final SpannableString xx0(C72976h2 h2Var) {
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(h2Var.getUsername());
        SpannableString valueOf = SpannableString.valueOf(MMApplicationContext.getContext().getString(C0966R.string.bvc));
        if (z1Var != null) {
            String As0 = ((C75339i) C86312j.m106911c(C75339i.class)).As0(z1Var, h2Var.getUsername(), true);
            valueOf = C72996z1.m85843n5(z1Var.getUsername()) ? ((C76158j) C86312j.m106911c(C76158j.class)).D30(MMApplicationContext.getContext(), As0, z1Var.mo73980x2(), C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3927j7)) : ((C76979h) C86312j.m106911c(C76979h.class)).op0(MMApplicationContext.getContext(), As0, C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3927j7));
        } else {
            Log.m105920e("MicroMsg.ConvBoxConversationService", "contact is null !");
        }
        if (valueOf.length() <= 0) {
            return new SpannableString(MMApplicationContext.getContext().getString(C0966R.string.bvc));
        }
        if (valueOf.length() <= 10) {
            return valueOf;
        }
        return SpannableString.valueOf(valueOf.subSequence(0, 10) + "...");
    }

    public final String yx0(C72976h2 h2Var) {
        String vx02;
        String vx03 = vx0(h2Var.mo108822p2());
        if (vx03 != null) {
            return "[" + vx03 + "]";
        } else if (h2Var.mo108822p2() == null || !h2Var.mo108822p2().contains(XVFSFile.PATH_SEPARATOR) || (vx02 = vx0(h2Var.mo108822p2().substring(h2Var.mo108822p2().indexOf(XVFSFile.PATH_SEPARATOR) + 1).replace(" ", ""))) == null) {
            return MMApplicationContext.getContext().getString(C0966R.string.f7957xf);
        } else {
            return "[" + vx02 + "]";
        }
    }

    /* JADX INFO: finally extract failed */
    public C72976h2 zx0() {
        C72976h2 h2Var;
        Exception e;
        Cursor I = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69738I(5, new ArrayList(), "conversationboxservice", -1);
        C72976h2 h2Var2 = null;
        try {
            if (I.moveToFirst()) {
                while (true) {
                    h2Var = new C72976h2();
                    try {
                        h2Var.convertFrom(I);
                        if (!TextUtils.isEmpty(h2Var.mo108822p2())) {
                            break;
                        } else if (!I.moveToNext()) {
                            break;
                        } else {
                            C72976h2 h2Var3 = h2Var;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            Log.printErrStackTrace("MicroMsg.ConvBoxConversationService", e, "getConvBoxLatestConv", new Object[0]);
                            I.close();
                            return h2Var;
                        } catch (Throwable th) {
                            I.close();
                            throw th;
                        }
                    }
                }
                h2Var2 = h2Var;
            }
            I.close();
            return h2Var2;
        } catch (Exception e3) {
            Exception exc = e3;
            h2Var = null;
            e = exc;
            Log.printErrStackTrace("MicroMsg.ConvBoxConversationService", e, "getConvBoxLatestConv", new Object[0]);
            I.close();
            return h2Var;
        }
    }
}
