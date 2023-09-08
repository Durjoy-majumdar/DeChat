package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import ck3.C67391b;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.contact.C74584x;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import dg0.C75398e;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C97625j3;
import hg0.C76166a;
import hg0.C76186t;
import junit.framework.Assert;
import ke3.C88144b;
import le3.C10499a;
import nj3.C76874e0;
import p196ln.C76708i;
import p629ny.C76979h;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.d6 */
public class C73952d6 extends C74023i {

    /* renamed from: v */
    public C67391b f217050v;

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6908rx);
        C73979e6 e6Var = new C73979e6();
        e6Var.mo103043a(n4Var, true);
        n4Var.setTag(e6Var);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return false;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        if (f4Var.getType() == 37) {
            String content = f4Var.getContent();
            Log.m105928w("MicroMsg.ChattingItemFMessageFrom", "dealClickVerifyMsgEvent : " + content);
            if (content != null && content.length() > 0) {
                C72963f4.C72971h ly02 = ((C72972g4) C97625j3.m125812b().mo105911z()).ly0(content);
                Assert.assertTrue(ly02.mo101039f().length() > 0);
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(ly02.mo101039f());
                Intent intent = new Intent();
                if (z1Var == null || z1Var.mo62907i3() <= 0 || !z1Var.mo62927s3()) {
                    intent.putExtra("Verify_ticket", ly02.mo101054u());
                    intent.putExtra("User_Verify", true);
                    intent.putExtra("Contact_User", ly02.mo101039f());
                    intent.putExtra("Contact_Alias", ly02.mo101034a());
                    intent.putExtra("Contact_Nick", ly02.mo101042i());
                    intent.putExtra("Contact_QuanPin", ly02.mo101048o());
                    intent.putExtra("Contact_PyInitial", ly02.mo101045l());
                    intent.putExtra("Contact_Sex", ly02.mo101050q());
                    intent.putExtra("Contact_Signature", ly02.mo101051r());
                    intent.putExtra("Contact_Scene", ly02.mo101049p());
                    intent.putExtra("Contact_FMessageCard", true);
                    intent.putExtra("Contact_City", ly02.mo101036c());
                    intent.putExtra("Contact_Province", ly02.mo101044k());
                    intent.putExtra("Contact_Mobile_MD5", ly02.mo101043j());
                    intent.putExtra("Contact_full_Mobile_MD5", ly02.mo101040g());
                    intent.putExtra("Contact_KSnsIFlag", ly02.mo101053t());
                    intent.putExtra("Contact_KSnsBgUrl", ly02.mo101052s());
                } else {
                    intent.putExtra("Contact_User", z1Var.getUsername());
                    C74584x.m89302e(intent, z1Var.getUsername());
                }
                String d = ly02.mo101037d();
                if (Util.nullAsNil(d).length() <= 0) {
                    int p = ly02.mo101049p();
                    if (p != 18) {
                        switch (p) {
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                                break;
                            default:
                                d = this.f217050v.mo91572m().getString(C0966R.string.b86);
                                break;
                        }
                    }
                    d = this.f217050v.mo91572m().getString(C0966R.string.b8_);
                }
                intent.putExtra("Contact_Content", d);
                intent.putExtra("Contact_verify_Scene", ly02.mo101049p());
                intent.putExtra("Contact_Uin", ly02.mo101047n());
                intent.putExtra("Contact_QQNick", ly02.mo101046m());
                intent.putExtra("Contact_Mobile_MD5", ly02.mo101043j());
                intent.putExtra("User_From_Fmessage", true);
                intent.putExtra("Contact_from_msgType", 37);
                intent.putExtra("Contact_KSnsIFlag", ly02.mo101053t());
                intent.putExtra("Contact_KSnsBgUrl", ly02.mo101052s());
                C88144b.m109790h(this.f217050v.mo91565f(), Scopes.PROFILE, ".ui.ContactInfoUI", intent);
                C10499a.m10432a(ly02.mo101049p());
            }
        } else if (f4Var.getType() == 40) {
            C72963f4.C72964b Rv0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Rv0(f4Var.getContent());
            if (Rv0.f212675a.length() > 0) {
                C10499a.m10432a(Rv0.f212681g);
                C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(Rv0.f212675a);
                if (z1Var2 != null && ((int) z1Var2.f108320R1) > 0 && z1Var2.mo62927s3()) {
                    C74584x.m89298a(this.f217050v.mo91565f(), z1Var2, Rv0);
                } else if (Rv0.f212684j > 0) {
                    C74584x.m89300c(this.f217050v.mo91565f(), Rv0);
                } else if (!Util.isNullOrNil(Rv0.f212682h) || !Util.isNullOrNil(Rv0.f212683i)) {
                    C76166a b = C75398e.vx0().mo106402b(Rv0.f212682h);
                    if ((b == null || b.mo106385e() == null || b.mo106385e().length() <= 0) && ((b = C75398e.vx0().mo106402b(Rv0.f212683i)) == null || b.mo106385e() == null || b.mo106385e().length() <= 0)) {
                        if (z1Var2 == null || ((int) z1Var2.f108320R1) <= 0) {
                            C74584x.m89300c(this.f217050v.mo91565f(), Rv0);
                        } else {
                            C74584x.m89298a(this.f217050v.mo91565f(), z1Var2, Rv0);
                        }
                        Log.m105920e("MicroMsg.ChattingItemFMessageFrom", "error : this is not the mobile contact, MD5 = " + Rv0.f212682h + " fullMD5:" + Rv0.f212683i);
                    } else {
                        if (b.mo106389i() == null || b.mo106389i().length() <= 0) {
                            b.f223120h = Rv0.f212675a;
                            b.f223112O = 128;
                            if (C75398e.vx0().mo106403d(b.mo106385e(), b) == -1) {
                                Log.m105920e("MicroMsg.ChattingItemFMessageFrom", "update mobile contact username failed");
                            }
                        }
                        C74584x.m89300c(this.f217050v.mo91565f(), Rv0);
                    }
                } else {
                    C74584x.m89300c(this.f217050v.mo91565f(), Rv0);
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        C67391b bVar2 = bVar;
        Class cls = C76708i.class;
        Class cls2 = C76979h.class;
        this.f217050v = bVar2;
        C73979e6 e6Var = (C73979e6) cVar;
        if (f4Var.getType() == 37) {
            C72963f4.C72971h ly02 = ((C72972g4) C97625j3.m125812b().mo105911z()).ly0(f4Var.getContent());
            String str2 = ly02.f212737a;
            if (str2 == null || str2.length() <= 0) {
                Log.m105920e("MicroMsg.ChattingItemFMessageFrom", "getView : parse verify msg failed");
                return;
            }
            ((C76708i) C86312j.m106911c(cls)).mo106848yE(ly02.f212737a, ly02.f212743g);
            if (C45628s0.m50740E(ly02.f212737a)) {
                e6Var.f217103f.setVisibility(8);
                e6Var.f217104g.setVisibility(8);
                e6Var.f217105h.setVisibility(0);
                e6Var.f217102e.setBackgroundColor(16777215);
                e6Var.f217105h.setText(bVar.mo91572m().getString(C0966R.string.f28));
            } else {
                e6Var.f217103f.setVisibility(0);
                e6Var.f217104g.setVisibility(0);
                e6Var.f217105h.setVisibility(0);
                e6Var.f217102e.setBackgroundResource(C0966R.C0969drawable.f4789mz);
                e6Var.f217105h.setText(bVar.mo91572m().getString(C0966R.string.f27));
            }
            int i = ly02.f212744h;
            if (i == 13) {
                C76166a a = C75398e.vx0().mo106401a(ly02.f212737a);
                if (a == null || a.mo106388h() == null || a.mo106388h().equals("")) {
                    e6Var.f217106i.setVisibility(8);
                } else {
                    e6Var.f217106i.setVisibility(0);
                    e6Var.f217106i.setText(bVar.mo91572m().getString(C0966R.string.b7x, new Object[]{a.mo106388h()}));
                }
            } else if (i != 18) {
                switch (i) {
                    case 22:
                    case 23:
                    case 24:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        e6Var.f217099b.setText(C0966R.string.b8a);
                        break;
                    case 25:
                        e6Var.f217099b.setText(C0966R.string.b84);
                        break;
                    case 30:
                        e6Var.f217099b.setText(C0966R.string.hqh);
                        break;
                    default:
                        e6Var.f217099b.setText(C0966R.string.b85);
                        break;
                }
            } else {
                e6Var.f217099b.setText(C0966R.string.b89);
            }
            e6Var.f217100c.setText(((C76979h) C86312j.m106911c(cls2)).yp0(bVar.mo91565f(), ly02.mo101038e(), e6Var.f217100c.getTextSize()));
            C74023i.m87883d0(e6Var.avatarIV, ly02.f212737a);
            e6Var.f217101d.setVisibility(0);
            String str3 = ly02.f212742f;
            if (str3 == null || str3.trim().equals("")) {
                e6Var.f217101d.setText(bVar.mo91572m().getString(C0966R.string.b8_));
            } else {
                e6Var.f217101d.setText(ly02.f212742f);
            }
        } else if (f4Var.getType() == 40) {
            C72963f4.C72964b Rv0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Rv0(f4Var.getContent());
            String str4 = Rv0.f212675a;
            if (str4 == null || str4.length() <= 0) {
                Log.m105920e("MicroMsg.ChattingItemFMessageFrom", "getView : parse possible friend msg failed");
                return;
            }
            ((C76708i) C86312j.m106911c(cls)).mo106848yE(Rv0.f212675a, Rv0.f212680f);
            if (C45628s0.m50740E(Rv0.f212675a)) {
                e6Var.f217103f.setVisibility(8);
                e6Var.f217104g.setVisibility(8);
                e6Var.f217105h.setVisibility(0);
                e6Var.f217102e.setBackgroundColor(16777215);
                e6Var.f217105h.setText(bVar.mo91572m().getString(C0966R.string.f28));
            } else {
                e6Var.f217103f.setVisibility(0);
                e6Var.f217104g.setVisibility(0);
                e6Var.f217105h.setVisibility(0);
                e6Var.f217102e.setBackgroundResource(C0966R.C0969drawable.f4789mz);
                e6Var.f217105h.setText(bVar.mo91572m().getString(C0966R.string.f27));
            }
            int i2 = Rv0.f212681g;
            if (i2 == 4) {
                e6Var.f217099b.setText(C0966R.string.b7r);
                e6Var.f217101d.setText(C0966R.string.b7s);
                String e = Rv0.mo101028e();
                if (e == null) {
                    e = Rv0.mo101025b();
                }
                e6Var.f217100c.setText(((C76979h) C86312j.m106911c(cls2)).yp0(bVar.mo91565f(), e, e6Var.f217100c.getTextSize()));
            } else if (i2 == 10 || i2 == 11) {
                e6Var.f217099b.setText(C0966R.string.b7w);
                String e2 = C76186t.m91537e(Rv0.f212682h);
                if (Util.isNullOrNil(e2)) {
                    e2 = C76186t.m91537e(Rv0.f212683i);
                }
                e6Var.f217101d.setText(bVar.mo91572m().getString(C0966R.string.b7x, new Object[]{e2}));
                e6Var.f217100c.setText(((C76979h) C86312j.m106911c(cls2)).yp0(bVar.mo91565f(), Rv0.mo101025b(), e6Var.f217100c.getTextSize()));
            } else if (i2 == 31) {
                e6Var.f217099b.setText(C0966R.string.b87);
                e6Var.f217101d.setText(C0966R.string.b88);
                e6Var.f217100c.setText(((C76979h) C86312j.m106911c(cls2)).yp0(bVar.mo91565f(), Rv0.mo101025b(), e6Var.f217100c.getTextSize()));
            } else if (i2 != 32) {
                Log.m105919d("MicroMsg.ChattingItemFMessageFrom", "prossible friend sceneType:%d", Integer.valueOf(i2));
                e6Var.f217099b.setText(C0966R.string.f360255b80);
                e6Var.f217101d.setText(C0966R.string.f360256b81);
                e6Var.f217100c.setText(((C76979h) C86312j.m106911c(cls2)).yp0(bVar.mo91565f(), Rv0.mo101025b(), e6Var.f217100c.getTextSize()));
            } else {
                e6Var.f217099b.setText(C0966R.string.f360258b83);
                e6Var.f217101d.setText(C0966R.string.f360257b82);
                e6Var.f217100c.setText(((C76979h) C86312j.m106911c(cls2)).yp0(bVar.mo91565f(), Rv0.mo101025b(), e6Var.f217100c.getTextSize()));
            }
            C74023i.m87883d0(e6Var.avatarIV, Rv0.f212675a);
        } else {
            Log.m105928w("MicroMsg.ChattingItemFMessageFrom", "FROM_FMESSAGE did not include this type, msgType = " + f4Var.getType());
        }
        e6Var.clickArea.setTag(new C74243t8(f4Var, bVar.mo91583x(), e6Var, (String) null));
        e6Var.clickArea.setOnClickListener(mo103099u(bVar2));
        e6Var.clickArea.setOnLongClickListener(mo103098p(bVar2));
        e6Var.clickArea.setOnTouchListener(((C79368l) bVar2.f193278b.mo102812a(C79368l.class)).mo108189Z4());
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return i == 37 || i == 40;
    }

    /* renamed from: m0 */
    public boolean mo26239m0() {
        return false;
    }
}
