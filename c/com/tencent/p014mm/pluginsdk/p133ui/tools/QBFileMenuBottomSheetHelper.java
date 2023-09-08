package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import c02.C92331c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80906n;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.p136ui.C85878m2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.handoff.model.HandOff;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C19569p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.xwebutil.C19894d;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import kotlin.Metadata;
import nj3.C76874e0;
import p159gw.C98250h;
import p262wm.C22921c;
import p262wm.C22923f;
import p407zo.C23547h;
import qo3.C77407n;
import qo3.C77426q;
import rx3.C13598b0;
import vd3.C22744b0;
import wc3.C15133e0;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.QBFileMenuBottomSheetHelper */
public final class QBFileMenuBottomSheetHelper implements C19569p0 {

    /* renamed from: a */
    public final MMActivity f55282a;

    /* renamed from: b */
    public final C19569p0.C19570a f55283b;

    /* renamed from: c */
    public final C19568o0 f55284c;

    /* renamed from: d */
    public C32224a<C13598b0> f55285d;

    /* renamed from: e */
    public C77407n f55286e;

    /* renamed from: f */
    public final C15133e0 f55287f = ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0();

    /* renamed from: g */
    public C32227p<? super C77407n, ? super C76874e0, C13598b0> f55288g;

    /* renamed from: h */
    public C32226l<? super MenuItem, C13598b0> f55289h;

    /* renamed from: i */
    public String f55290i;

    /* renamed from: j */
    public Drawable f55291j;

    /* renamed from: k */
    public String f55292k;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.QBFileMenuBottomSheetHelper$b */
    public enum C19539b {
        ;
        

        /* renamed from: d */
        public final int f55294d;

        /* access modifiers changed from: public */
        C19539b(int i) {
            this.f55294d = i;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog$IPCData;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "IPCData", "feature-attachment_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog */
    public static final class IPCInvokeTask_ShowConfirmDialog implements C80883e<IPCData, IPCVoid> {

        @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog$IPCData;", "Landroid/os/Parcelable;", "CREATOR", "a", "feature-attachment_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
        /* renamed from: com.tencent.mm.pluginsdk.ui.tools.QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog$IPCData */
        public static final class IPCData implements Parcelable {
            public static final C19540a CREATOR = new C19540a((C8480h) null);

            /* renamed from: d */
            public final String f55295d;

            /* renamed from: e */
            public final String f55296e;

            /* renamed from: f */
            public final String f55297f;

            /* renamed from: g */
            public final String f55298g;

            /* renamed from: h */
            public final Long f55299h;

            /* renamed from: com.tencent.mm.pluginsdk.ui.tools.QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog$IPCData$a */
            public static final class C19540a implements Parcelable.Creator<IPCData> {
                public C19540a(C8480h hVar) {
                }

                public Object createFromParcel(Parcel parcel) {
                    C87412m.m108594g(parcel, "parcel");
                    return new IPCData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), Long.valueOf(parcel.readLong()));
                }

                public Object[] newArray(int i) {
                    return new IPCData[i];
                }
            }

            public IPCData(String str, String str2, String str3, String str4, Long l) {
                this.f55295d = str;
                this.f55296e = str2;
                this.f55297f = str3;
                this.f55298g = str4;
                this.f55299h = l;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                C87412m.m108594g(parcel, "parcel");
                parcel.writeString(this.f55295d);
                parcel.writeString(this.f55296e);
                parcel.writeString(this.f55297f);
                parcel.writeString(this.f55298g);
                Long l = this.f55299h;
                parcel.writeLong(l != null ? l.longValue() : 0);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
            r9 = r9.f55299h;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void invoke(java.lang.Object r9, com.tencent.p014mm.ipcinvoker.C1256g r10) {
            /*
                r8 = this;
                com.tencent.mm.pluginsdk.ui.tools.QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog$IPCData r9 = (com.tencent.p014mm.pluginsdk.p133ui.tools.QBFileMenuBottomSheetHelper.IPCInvokeTask_ShowConfirmDialog.IPCData) r9
                android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                java.lang.String r1 = "com.tencent.mm.pluginsdk.ui.tools.QBFileShareProxyUI"
                android.content.Intent r0 = r0.setClassName(r10, r1)
                java.lang.String r1 = "Intent().setClassName(co…ools.QBFileShareProxyUI\")"
                gy3.C87412m.m108593f(r0, r1)
                r1 = 268435456(0x10000000, float:2.5243549E-29)
                r0.setFlags(r1)
                java.lang.String r1 = ""
                if (r9 == 0) goto L_0x0023
                java.lang.String r2 = r9.f55296e
                if (r2 != 0) goto L_0x0024
            L_0x0023:
                r2 = r1
            L_0x0024:
                java.lang.String r3 = "file_path"
                r0.putExtra(r3, r2)
                if (r9 == 0) goto L_0x002f
                java.lang.String r2 = r9.f55297f
                if (r2 != 0) goto L_0x0030
            L_0x002f:
                r2 = r1
            L_0x0030:
                java.lang.String r3 = "file_name"
                r0.putExtra(r3, r2)
                if (r9 == 0) goto L_0x003b
                java.lang.String r2 = r9.f55298g
                if (r2 != 0) goto L_0x003c
            L_0x003b:
                r2 = r1
            L_0x003c:
                java.lang.String r3 = "file_ext"
                r0.putExtra(r3, r2)
                if (r9 == 0) goto L_0x0049
                java.lang.String r2 = r9.f55295d
                if (r2 != 0) goto L_0x0048
                goto L_0x0049
            L_0x0048:
                r1 = r2
            L_0x0049:
                java.lang.String r2 = "to_user"
                r0.putExtra(r2, r1)
                if (r9 == 0) goto L_0x005a
                java.lang.Long r9 = r9.f55299h
                if (r9 == 0) goto L_0x005a
                long r1 = r9.longValue()
                goto L_0x005c
            L_0x005a:
                r1 = 0
            L_0x005c:
                java.lang.String r9 = "forward_msgid"
                r0.putExtra(r9, r1)
                k20.a r9 = new k20.a
                r9.<init>()
                r9.mo10233c(r0)
                java.lang.Object[] r1 = r9.mo10232b()
                java.lang.String r2 = "com/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog"
                java.lang.String r3 = "invoke"
                java.lang.String r4 = "(Lcom/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog$IPCData;Lcom/tencent/mm/ipcinvoker/IPCInvokeCallback;)V"
                java.lang.String r5 = "Undefined"
                java.lang.String r6 = "startActivity"
                java.lang.String r7 = "(Landroid/content/Intent;)V"
                r0 = r10
                j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
                r0 = 0
                java.lang.Object r9 = r9.mo10231a(r0)
                android.content.Intent r9 = (android.content.Intent) r9
                r10.startActivity(r9)
                java.lang.String r1 = "com/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog"
                java.lang.String r2 = "invoke"
                java.lang.String r3 = "(Lcom/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$IPCInvokeTask_ShowConfirmDialog$IPCData;Lcom/tencent/mm/ipcinvoker/IPCInvokeCallback;)V"
                java.lang.String r4 = "Undefined"
                java.lang.String r5 = "startActivity"
                java.lang.String r6 = "(Landroid/content/Intent;)V"
                r0 = r10
                j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.tools.QBFileMenuBottomSheetHelper.IPCInvokeTask_ShowConfirmDialog.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.g):void");
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$a;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "<init>", "()V", "feature-attachment_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.QBFileMenuBottomSheetHelper$a */
    public static final class C19541a implements C80916r<IPCString, IPCString> {
        public Object invoke(Object obj) {
            IPCString iPCString = (IPCString) obj;
            return (iPCString == null || !C87412m.m108589b(WeChatProcess.PROCESS_MAIN, C80906n.m98775b())) ? new IPCString("") : new IPCString(((C22921c) C86312j.m106911c(C22921c.class)).Xa0(iPCString.f10315d, 0));
        }
    }

    public QBFileMenuBottomSheetHelper(MMActivity mMActivity, C19569p0.C19570a aVar, C19568o0 o0Var) {
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(aVar, "config");
        C87412m.m108594g(o0Var, "creator");
        this.f55282a = mMActivity;
        this.f55283b = aVar;
        this.f55284c = o0Var;
        String str = ((IPCString) C80907o.m98783f(WeChatProcess.PROCESS_MAIN, new IPCString(aVar.f55384g), C19541a.class)).f10315d;
        Log.m105924i("MicroMsg.QBMenuBottomSheetHelper", "init defaultPkgName:" + str);
        C87412m.m108593f(str, "invokeSync(\n        WeCh…efaultPkgName:$it\")\n    }");
        this.f55290i = str;
    }

    /* renamed from: a */
    public static final void m20939a(QBFileMenuBottomSheetHelper qBFileMenuBottomSheetHelper, MenuItem menuItem) {
        C19539b bVar;
        QBFileMenuBottomSheetHelper qBFileMenuBottomSheetHelper2 = qBFileMenuBottomSheetHelper;
        qBFileMenuBottomSheetHelper.getClass();
        Class cls = C22923f.class;
        C19539b[] values = C19539b.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                bVar = null;
                break;
            }
            bVar = values[i];
            if (bVar.ordinal() == menuItem.getItemId()) {
                break;
            }
            i++;
        }
        if (bVar != null) {
            String num = Integer.toString(qBFileMenuBottomSheetHelper.hashCode());
            C19569p0.C19570a aVar = qBFileMenuBottomSheetHelper2.f55283b;
            ((C23547h) C86312j.m106911c(C23547h.class)).mo36799xH(num, aVar.f55380c, MD5Util.getMD5String(aVar.f55382e), (long) bVar.f55294d, qBFileMenuBottomSheetHelper2.f55283b.f55384g, qBFileMenuBottomSheetHelper2.f55284c.mo25335P6());
        }
        Log.m105924i("MicroMsg.QBMenuBottomSheetHelper", "dealMenuClick: " + menuItem.getItemId());
        int itemId = menuItem.getItemId();
        C19539b[] bVarArr = C19539b.f55293e;
        if (itemId == 0) {
            WXWebReporter.onPluginMenuSendClick(qBFileMenuBottomSheetHelper2.f55283b.f55380c);
            MMActivity mMActivity = qBFileMenuBottomSheetHelper2.f55282a;
            C19569p0.C19570a aVar2 = qBFileMenuBottomSheetHelper2.f55283b;
            C19894d.m21646e(mMActivity, aVar2.f55381d, aVar2.f55382e, aVar2.f55380c, aVar2.f55386i);
        } else if (itemId == 1) {
            C32224a<C13598b0> aVar3 = qBFileMenuBottomSheetHelper2.f55285d;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId == 2) {
            if (qBFileMenuBottomSheetHelper2.f55283b.f55379b != null) {
                HandOff handOff = qBFileMenuBottomSheetHelper2.f55283b.f55379b;
                C87412m.m108591d(handOff);
                ((C92331c) C86312j.m106911c(C92331c.class)).k00(handOff);
            }
        } else if (itemId == 4) {
            C77426q qVar = new C77426q(qBFileMenuBottomSheetHelper2.f55282a);
            qVar.mo107595g(qBFileMenuBottomSheetHelper2.f55282a.getString(C0966R.string.f360935g33));
            qVar.mo107589a(true);
            qVar.mo107601m(C0966R.string.f7564js);
            qVar.mo107600l(new C19558e1(qBFileMenuBottomSheetHelper2));
            qVar.mo107597i(C106591f1.f318505a);
            qVar.mo107603o();
        } else if (itemId == 5) {
            WXWebReporter.onPluginMenuOpenByOtherClick(qBFileMenuBottomSheetHelper2.f55283b.f55380c);
            C22921c cVar = (C22921c) C86312j.m106911c(C22921c.class);
            MMActivity mMActivity2 = qBFileMenuBottomSheetHelper2.f55282a;
            C19569p0.C19570a aVar4 = qBFileMenuBottomSheetHelper2.f55283b;
            cVar.O80(mMActivity2, aVar4.f55381d, aVar4.f55380c, 8, aVar4.f55385h ? 3 : 2);
        } else if (itemId == 3) {
            Intent className = new Intent().setClassName(MMApplicationContext.getContext(), "com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI");
            C87412m.m108593f(className, "Intent().setClassName(\n …ttingSendDataToDeviceUI\")");
            className.putExtra("Retr_Msg_Id", qBFileMenuBottomSheetHelper2.f55283b.f55386i);
            className.addFlags(268435456);
            Context context = MMApplicationContext.getContext();
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(className);
            Context context2 = context;
            C117292a.m165358d(context2, aVar5.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper", "dealMenuClick", "(Landroid/view/MenuItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar5.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper", "dealMenuClick", "(Landroid/view/MenuItem;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (itemId == 7) {
            qBFileMenuBottomSheetHelper2.f55283b.f55378a.mo67895G(true);
        } else {
            String str = "";
            if (itemId == 8) {
                C98250h hVar = (C98250h) C86312j.m106911c(C98250h.class);
                MMActivity mMActivity3 = qBFileMenuBottomSheetHelper2.f55282a;
                String str2 = qBFileMenuBottomSheetHelper2.f55283b.f55381d;
                if (str2 != null) {
                    str = str2;
                }
                hVar.pk0(mMActivity3, str, new C19560g1(qBFileMenuBottomSheetHelper2));
            } else if (itemId == 6) {
                C85878m2.m106216e(qBFileMenuBottomSheetHelper2.f55282a.getTaskId(), (C85878m2.C85879a) null);
            } else if (itemId == 9) {
                MMActivity mMActivity4 = qBFileMenuBottomSheetHelper2.f55282a;
                C19569p0.C19570a aVar6 = qBFileMenuBottomSheetHelper2.f55283b;
                ((C22923f) C86312j.m106911c(cls)).mo35896AT(mMActivity4, aVar6.f55381d, aVar6.f55382e, aVar6.f55380c, String.valueOf(mMActivity4.hashCode()), "SEARCH_IN_FILE", qBFileMenuBottomSheetHelper2.f55283b.f55383f);
            } else if (itemId == 10) {
                C22923f fVar = (C22923f) C86312j.m106911c(cls);
                MMActivity mMActivity5 = qBFileMenuBottomSheetHelper2.f55282a;
                C19569p0.C19570a aVar7 = qBFileMenuBottomSheetHelper2.f55283b;
                String str3 = aVar7.f55381d;
                String str4 = str3 == null ? str : str3;
                String str5 = aVar7.f55382e;
                String str6 = str5 == null ? str : str5;
                String str7 = aVar7.f55380c;
                String str8 = str7 == null ? str : str7;
                String valueOf = String.valueOf(mMActivity5.hashCode());
                String str9 = qBFileMenuBottomSheetHelper2.f55283b.f55383f;
                ((C22744b0) fVar.mo35902RU(mMActivity5, str4, str6, str8, valueOf, str9 == null ? str : str9, qBFileMenuBottomSheetHelper2.f55284c)).f65444h.mo140655A();
            }
        }
    }

    /* renamed from: b */
    public void mo25344b() {
        C77407n nVar = this.f55286e;
        if (nVar != null) {
            nVar.f225776l1 = false;
        }
        C77407n nVar2 = new C77407n((Context) this.f55282a, 0, false);
        this.f55286e = nVar2;
        this.f55287f.Q60(this.f55282a, nVar2, 1, (C32226l<? super Boolean, C13598b0>) null, new C19555d1(this));
        nVar2.f225771i = new C19562h1(this, nVar2);
        nVar2.f225773j = new C19564i1(this, nVar2);
        nVar2.f225782p = new C19566j1(this);
        nVar2.f225787r = new C19567k1(this);
    }
}
