package com.tencent.p014mm.p136ui.chatting.component;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import ck3.C67391b;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelsimple.C40358f0;
import com.tencent.p014mm.p136ui.AllRemindMsgUI;
import com.tencent.p014mm.p136ui.C74785j2;
import com.tencent.p014mm.p136ui.LauncherUI;
import com.tencent.p014mm.p136ui.chatting.view.C57702l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.account.p024ui.C1468a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import eb0.C75604z3;
import eb0.C97625j3;
import java.io.IOException;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p270xi.C91212b;
import pe3.C89349b;
import te3.C52007xq3;
import te3.C64763v03;
import zj3.C79364i0;
import zj3.C79368l;

@C91212b(exportInterface = C79364i0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.m3 */
public class C73533m3 extends C73412a implements C79364i0, C11385n {

    /* renamed from: com.tencent.mm.ui.chatting.component.m3$a */
    public class C57675a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f165085d;

        public C57675a(C72963f4 f4Var) {
            this.f165085d = f4Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C73533m3.this.mo102499Z5(this.f165085d);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.m3$b */
    public class C57676b implements C57702l.C57703a {

        /* renamed from: a */
        public final /* synthetic */ C57702l f165087a;

        /* renamed from: b */
        public final /* synthetic */ C72963f4 f165088b;

        public C57676b(C57702l lVar, C72963f4 f4Var) {
            this.f165087a = lVar;
            this.f165088b = f4Var;
        }

        /* renamed from: a */
        public void mo82035a(long j) {
            C104428a aVar = this.f165087a.f165144c;
            if (aVar != null) {
                aVar.dismiss();
            }
            C115669n.INSTANCE.idkeyStat(795, 1, 1, false);
            if (!NetStatusUtil.isConnected((Context) C73533m3.this.f215752d.mo91565f())) {
                C76879j.m92748s(C73533m3.this.f215752d.mo91565f(), C73533m3.this.f215752d.mo91572m().getString(C0966R.string.f360087a11), C73533m3.this.f215752d.mo91572m().getString(C0966R.string.hzd));
                return;
            }
            C52007xq3 xq32 = new C52007xq3();
            xq32.f144879f = (int) (j / 1000);
            xq32.f144878e = 1;
            xq32.f144880g = 1;
            try {
                C64763v03 v032 = new C64763v03();
                v032.f185817f = C73533m3.this.f215752d.mo91577r();
                v032.f185818g = this.f165088b.mo108774y2();
                v032.f185815d = C73533m3.m86947Y5(C73533m3.this, this.f165088b);
                xq32.f144881h = new C89349b(v032.toByteArray());
            } catch (IOException e) {
                Log.m105921e("MicroMsg.ChattingUI.MsgRemindComponent", "[onOk] %s", e.toString());
            }
            C97625j3.m125815e().mo123460f(new C40358f0(1, xq32));
        }

        public void onCancel() {
            C104428a aVar = this.f165087a.f165144c;
            if (aVar != null) {
                aVar.dismiss();
            }
        }
    }

    /* renamed from: Y5 */
    public static String m86947Y5(C73533m3 m3Var, C72963f4 f4Var) {
        C68070l.C68072b u;
        int i;
        m3Var.getClass();
        if (f4Var.mo100993e4() || f4Var.mo100963C3()) {
            String content = f4Var.getContent();
            int t = C75604z3.m90848t(content);
            return t != -1 ? content.substring(t + 1).trim() : content;
        }
        if (f4Var.mo100977P3() || f4Var.mo100987Z3()) {
            String content2 = f4Var.getContent();
            int indexOf = f4Var.getContent().indexOf(58);
            if (indexOf != -1) {
                content2 = f4Var.getContent().substring(indexOf + 1);
            }
            if (!(content2 == null || (u = C68070l.C68072b.m80422u(content2, f4Var.mo108775z2())) == null || ((i = u.f195582i) != 53 && i != 57))) {
                return u.f195570f;
            }
        }
        String H7 = AllRemindMsgUI.m66358H7(m3Var.f215752d.mo91565f(), f4Var.getType(), f4Var.getContent(), m3Var.f215752d.mo91577r(), f4Var.mo108769t2());
        Log.m105925i("MicroMsg.ChattingUI.MsgRemindComponent", "[getRemindTitle] msgId:%s type:%s title:%s", Long.valueOf(f4Var.getMsgId()), Integer.valueOf(f4Var.getType()), H7);
        return H7;
    }

    /* renamed from: Z5 */
    public final void mo102499Z5(C72963f4 f4Var) {
        C57702l lVar = new C57702l(this.f215752d.mo91565f());
        lVar.f165149h = new C57676b(lVar, f4Var);
        C104428a aVar = lVar.f165144c;
        if (aVar != null) {
            aVar.show();
        }
        C115669n.INSTANCE.idkeyStat(795, 0, 1, false);
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        C97625j3.m125815e().mo123455a(525, this);
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        C97625j3.m125815e().mo123470p(525, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.ChattingUI.MsgRemindComponent", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + " sceneType:" + yVar.getType());
        this.f215752d.mo91561b();
        C67391b bVar = this.f215752d;
        if (!bVar.f193283g) {
            Log.m105924i("MicroMsg.ChattingUI.MsgRemindComponent", "onSceneEnd fragment not foreground, return");
        } else if (Util.isTopActivity(bVar.mo91565f())) {
            Activity f = this.f215752d.mo91565f();
            if (!(C74785j2.C6981a.m7247a(f, i, i2, str, 7) || C1468a.m1500a(f, i, i2, new Intent().setClass(f, LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), str))) {
                if (i == 0 && i2 == 0) {
                    if (yVar.getType() == 525) {
                        Log.m105924i("MicroMsg.ChattingUI.MsgRemindComponent", "set msg remind!");
                        Activity f2 = this.f215752d.mo91565f();
                        View contentView = this.f215752d.f193286j.getContentView();
                        String string = this.f215752d.mo91572m().getString(C0966R.string.fjf);
                        C75018a.C75023c cVar = new C75018a.C75023c(f2, contentView);
                        cVar.f220747c = string;
                        cVar.f220748d = "";
                        cVar.f220749e = 2500;
                        C75026b.m89956f(cVar, (C75018a.C75024d) null, (C75018a.C75025e) null);
                    }
                } else if (yVar.getType() == 525) {
                    Log.m105921e("MicroMsg.ChattingUI.MsgRemindComponent", "[setMsgRemind] scene type:%s errCode:%s, errType:%s, errMsg:%s", 525, Integer.valueOf(i2), Integer.valueOf(i), Util.nullAsNil(str));
                    Activity f3 = this.f215752d.mo91565f();
                    if (Util.isNullOrNil(str)) {
                        str = this.f215752d.mo91572m().getString(C0966R.string.hzc);
                    }
                    C76879j.m92748s(f3, str, this.f215752d.mo91572m().getString(C0966R.string.hzd));
                    C115669n.INSTANCE.idkeyStat(795, 4, 1, false);
                }
            }
        }
    }

    /* renamed from: t */
    public void mo102500t(MenuItem menuItem, int i, C74023i iVar) {
        C72963f4 item = ((C79368l) this.f215752d.f193278b.mo102812a(C79368l.class)).getItem(menuItem.getGroupId());
        if (item == null) {
            Log.m105920e("MicroMsg.ChattingUI.MsgRemindComponent", "context item select failed, null msg");
        } else if (menuItem.getItemId() == 134) {
            C85801v1 u = C97625j3.m125812b().mo105906u();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_POSITION_REMIND_MSG_TIP_IN_BOOLEAN;
            if (((Boolean) u.mo119685f(aVar, Boolean.TRUE)).booleanValue()) {
                C76879j.m92749t(this.f215752d.mo91565f(), this.f215752d.mo91572m().getString(C0966R.string.hzg), this.f215752d.mo91572m().getString(C0966R.string.hzh), new C57675a(item));
                C97625j3.m125812b().mo105906u().mo119677K(aVar, Boolean.FALSE);
                return;
            }
            mo102499Z5(item);
        }
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        C97625j3.m125815e().mo123470p(525, this);
    }
}
