package wd3;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.plugin.emoji.model.EmojiLogic;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import d62.C75339i;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76901s0;
import p008bq.C67305d1;
import p185kq.C76622f;
import p196ln.C76705f;
import p260wk.C102457e;
import p441aq.C92054g;
import p629ny.C76979h;
import qo3.C77389a;
import qo3.C77398g;
import te3.C77981px3;
import wc3.C78541w;
import wd3.C78575u;
import z51.C79305f;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: wd3.c0 */
public class C78552c0 extends C86301e implements C78541w {
    public C77398g Ac0(MMActivityController mMActivityController, String str, String str2, String str3, String str4, boolean z, String str5, String str6, C65953v0 v0Var) {
        String str7 = str;
        String str8 = str3;
        String str9 = str4;
        if ((str7 == null || str.length() == 0) && (str8 == null || str3.length() == 0)) {
            Log.m105920e("MicroMsg.MMConfirmDialog", "showDialogItem1 fail, title message both are empty");
            return null;
        }
        View inflate = View.inflate(mMActivityController.mo177096t(), C0966R.C0971layout.f7042vx, (ViewGroup) null);
        C77398g.C77402i iVar = new C77398g.C77402i(mMActivityController.mo177096t());
        C77389a aVar = iVar.f225714b;
        aVar.f225668y = false;
        aVar.f225669z = false;
        AppCompatActivity t = mMActivityController.mo177096t();
        iVar.f225714b.f225644a = str7;
        int color = t.getResources().getColor(C0966R.color.a7f);
        C77389a aVar2 = iVar.f225714b;
        aVar2.f225630M = color;
        aVar2.f225631N = 2;
        if (inflate != null) {
            EditText editText = (EditText) inflate.findViewById(C0966R.C0970id.blm);
            if (editText != null) {
                editText.setVisibility(z ? 0 : 8);
            }
            editText.setText(str5);
        }
        C78575u.m94937f(mMActivityController, iVar, v0Var, inflate, str6);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.bll);
        textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(mMActivityController.mo177096t(), str8, textView.getTextSize()));
        if (str9 == null || str4.length() == 0) {
            View findViewById = inflate.findViewById(C0966R.C0970id.blg);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar3.mo10233c(8);
            C117292a.m165358d(findViewById, aVar3.mo10232b(), "com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog", "showDialogItem1", "(Lcom/tencent/mm/ui/MMActivityController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/pluginsdk/ui/applet/IConfirmDialog$IOnDialogClick;)Lcom/tencent/mm/ui/widget/dialog/MMAlertDialog;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog", "showDialogItem1", "(Lcom/tencent/mm/ui/MMActivityController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/pluginsdk/ui/applet/IConfirmDialog$IOnDialogClick;)Lcom/tencent/mm/ui/widget/dialog/MMAlertDialog;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            ((TextView) inflate.findViewById(C0966R.C0970id.blg)).setText(str9);
        }
        int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(mMActivityController.mo177096t(), 120.0f);
        CdnImageView cdnImageView = (CdnImageView) inflate.findViewById(C0966R.C0970id.bln);
        if (cdnImageView != null) {
            cdnImageView.mo100288c(str2, fromDPToPix, fromDPToPix, -1);
        }
        iVar.f225714b.f225627J = inflate;
        C77398g a = iVar.mo107548a();
        a.show();
        return a;
    }

    /* renamed from: Em */
    public void mo108483Em(Context context, String str, String str2, String str3, String str4, String str5, C65953v0 v0Var) {
        C78575u.C78583h hVar = new C78575u.C78583h(context);
        hVar.mo108578p(str);
        hVar.mo108571i(str2);
        hVar.f230208d = str3;
        hVar.mo108575m(str5);
        hVar.mo108576n(8);
        hVar.f230206b.f225714b.f225647d = str4;
        hVar.mo108563a(v0Var);
        hVar.mo108574l();
    }

    /* renamed from: Gd */
    public C77398g mo108484Gd(Context context, String str, Bitmap bitmap, String str2, int i, C65953v0 v0Var) {
        C78575u.C78583h hVar = new C78575u.C78583h(context);
        hVar.mo108566d(bitmap, i);
        hVar.mo108578p(str);
        hVar.mo108569g(Boolean.TRUE);
        hVar.mo108570h(false);
        hVar.f230208d = str2;
        hVar.mo108563a(v0Var);
        return hVar.f230207c;
    }

    public C76901s0 Iu0(MMActivityController mMActivityController, Bitmap bitmap, String str, String str2, String str3, String str4, String str5, C65953v0 v0Var) {
        ImageView imageView;
        Class cls = C79305f.class;
        View c = C78575u.m94934c(mMActivityController.mo177096t(), C0966R.C0971layout.f7045w0);
        C76901s0 s0Var = new C76901s0(c, -1, -1);
        C78575u.m94935d(c, v0Var, s0Var);
        if (Util.isNullOrNil(str2)) {
            Log.m105920e("MicroMsg.MMConfirmDialog", "showDialogItem8 fail,title or  message is empty");
            return null;
        }
        C78575u.m94939h(c, C0966R.C0970id.blp, str2, false, 0);
        NoMeasuredTextView noMeasuredTextView = (NoMeasuredTextView) c.findViewById(C0966R.C0970id.bll);
        noMeasuredTextView.setShouldEllipsize(true);
        noMeasuredTextView.mo153549i(0, mMActivityController.mo177096t().getResources().getDimension(C0966R.dimen.f3628l) * C76577a.m92165p(mMActivityController.mo177096t()));
        noMeasuredTextView.setTextColor(C76577a.m92154e(mMActivityController.mo177096t(), C0966R.color.a7f));
        if (!Util.isNullOrNil(str)) {
            noMeasuredTextView.setText((CharSequence) ((C79305f) C86312j.m106911c(cls)).mo109312T1(mMActivityController.mo177096t(), ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str)));
        } else {
            noMeasuredTextView.setText((CharSequence) ((C79305f) C86312j.m106911c(cls)).mo109312T1(mMActivityController.mo177096t(), str3));
        }
        C78575u.m94939h(c, C0966R.C0970id.blh, str4, true, 8);
        Button button = (Button) c.findViewById(C0966R.C0970id.bl7);
        if (!Util.isNullOrNil(str5)) {
            button.setText(str5);
        }
        button.setOnClickListener(new C78550b0(v0Var, c, s0Var));
        if (!Util.isNullOrNil(str)) {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z((ImageView) c.findViewById(C0966R.C0970id.bln), str);
        } else if (!(bitmap == null || (imageView = (ImageView) c.findViewById(C0966R.C0970id.bln)) == null)) {
            if (!bitmap.isRecycled()) {
                imageView.setImageBitmap(bitmap);
                s0Var.setOnDismissListener(new C78586w(bitmap));
            } else {
                imageView.setVisibility(8);
            }
        }
        C78575u.m94941j(mMActivityController, s0Var);
        return s0Var;
    }

    public void Lj0(Context context, String str, String str2, C65953v0 v0Var) {
        C78575u.C78583h hVar = new C78575u.C78583h(context);
        hVar.mo108578p(str);
        C77389a aVar = hVar.f230206b.f225714b;
        aVar.f225643Z = true;
        aVar.f225639V = 20;
        aVar.f225640W = 20;
        hVar.f230208d = str2;
        hVar.mo108563a(new c0$$d(this, v0Var));
        hVar.mo108574l();
    }

    public void Op0(Context context, String str, String str2, String str3, String str4, String str5, C65953v0 v0Var) {
        Class cls = C92054g.class;
        ((C92054g) C86312j.m106911c(cls)).getClass();
        EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(str2);
        String q = EmojiLogic.m117486q(((C67305d1) C86312j.m106911c(C67305d1.class)).rx0(), "", str2);
        if (TO == null) {
            int i = ImgUtil.isGif(q) ? 2 : 1;
            EmojiInfo emojiInfo = new EmojiInfo();
            emojiInfo.field_md5 = str2;
            emojiInfo.field_catalog = 65;
            emojiInfo.field_type = i;
            emojiInfo.field_size = (int) C86013q1.m106451l(q);
            emojiInfo.field_temp = 1;
            emojiInfo.field_designerID = str3;
            emojiInfo.field_thumbUrl = str5;
            ((C92054g) C86312j.m106911c(cls)).getClass();
            C30790w2.m39221h().mo57717d().mo142040Ow(emojiInfo);
            TO = emojiInfo;
        }
        C78575u.C78583h hVar = new C78575u.C78583h(context);
        hVar.mo108578p(str);
        hVar.mo108568f(TO, str4);
        hVar.mo108569g(Boolean.TRUE);
        hVar.f230208d = context.getString(C0966R.string.a2s);
        hVar.mo108563a(v0Var);
        hVar.mo108574l();
    }

    public void Q10(Context context, String str, String str2, String str3, C65953v0 v0Var) {
        C78575u.C78583h hVar = new C78575u.C78583h(context);
        hVar.mo108578p(str);
        hVar.mo108567e(str2);
        hVar.mo108569g(Boolean.TRUE);
        hVar.f230208d = str3;
        hVar.mo108563a(v0Var);
        hVar.mo108574l();
    }

    /* renamed from: Qb */
    public void mo108489Qb(Context context, String str, byte[] bArr, C65953v0 v0Var, int i, long j, C78541w.C78542a aVar) {
        Class cls = C92054g.class;
        Log.m105924i("MicroMsg.emoji.ConfirmDialogSerirvce", "showEmojiTransmitDialogForTagSearch");
        C77981px3 px32 = new C77981px3();
        try {
            px32.parseFrom(bArr);
        } catch (Exception unused) {
        }
        ((C92054g) C86312j.m106911c(cls)).getClass();
        EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(px32.f228046d);
        if (TO == null) {
            TO = new EmojiInfo();
            String q = EmojiLogic.m117486q(((C67305d1) C86312j.m106911c(C67305d1.class)).rx0(), "", px32.f228046d);
            TO.field_md5 = px32.f228046d;
            TO.field_catalog = 65;
            TO.field_type = ImgUtil.isGif(q) ? 2 : 1;
            TO.field_groupId = px32.f228048f;
            TO.field_size = (int) C86013q1.m106451l(q);
            TO.field_temp = 1;
            TO.field_activityid = px32.f228051i;
            TO.field_designerID = px32.f228050h;
            TO.field_thumbUrl = px32.f228049g;
            if (!Util.isNullOrNil(px32.f228058s)) {
                TO.field_encrypturl = px32.f228057r;
                TO.field_aeskey = px32.f228058s;
            } else {
                TO.field_cdnUrl = px32.f228057r;
            }
            ((C92054g) C86312j.m106911c(cls)).getClass();
            C30790w2.m39221h().mo57717d().mo142040Ow(TO);
        } else if (Util.isNullOrNil(TO.field_groupId) && !Util.isNullOrNil(px32.f228048f)) {
            TO.field_groupId = px32.f228048f;
            ((C92054g) C86312j.m106911c(cls)).getClass();
            C30790w2.m39221h().mo57717d().r50(TO);
        }
        C102457e.f301712a.mo142073e(TO, new c0$$a(aVar, TO, str, j));
    }

    /* renamed from: SX */
    public void mo108490SX(Context context, String str, Bitmap bitmap, C65953v0 v0Var) {
        C78575u.C78583h hVar = new C78575u.C78583h(context);
        hVar.mo108578p(str);
        hVar.mo108569g(Boolean.TRUE);
        hVar.mo108573k(C0966R.string.a2s);
        hVar.mo108566d(bitmap, 3);
        hVar.mo108577o(context.getResources().getString(C0966R.string.i4c));
        hVar.mo108563a(v0Var);
        hVar.mo108574l();
    }

    /* renamed from: Sz */
    public void mo108491Sz(Context context, String str, String str2, String str3, C65953v0 v0Var) {
        C78575u.C78583h hVar = new C78575u.C78583h(context);
        hVar.mo108578p(str);
        hVar.mo108571i(str2);
        hVar.mo108569g(Boolean.TRUE);
        hVar.mo108572j(2);
        hVar.f230208d = str3;
        hVar.mo108563a(v0Var);
        hVar.mo108574l();
    }

    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean, code=?, for r4v4, types: [boolean] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qo3.C77398g Tm0(android.content.Context r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, wd3.C65953v0 r31) {
        /*
            r26 = this;
            r0 = r27
            wd3.u$h r1 = new wd3.u$h
            r1.<init>(r0)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r29)
            r3 = 0
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r3)
            java.lang.Class<com.tencent.mm.pluginsdk.ui.tools.m> r4 = com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m.class
            com.tencent.mm.message.g r4 = r2.mo93555w(r4)
            com.tencent.mm.pluginsdk.ui.tools.m r4 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m) r4
            wd3.b1 r5 = new wd3.b1
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L_0x0262
            java.lang.Class<gt.k> r7 = p158gt.C98201k.class
            n60.f$a r8 = new n60.f$a
            r8.<init>()
            r9 = 1
            r8.f293176b = r9
            r8.f293175a = r9
            r8.f293186l = r9
            r8.mo139398a()
            r8 = 2131497492(0x7f0c1214, float:1.8618579E38)
            android.view.View r8 = android.view.View.inflate(r0, r8, r3)
            r10 = 2131312651(0x7f09400b, float:1.8243677E38)
            android.view.View r10 = r8.findViewById(r10)
            com.tencent.mm.ui.widget.RoundCornerRelativeLayout r10 = (com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout) r10
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r12 = 4
            int r11 = kg3.C76577a.m92151b(r11, r12)
            float r11 = (float) r11
            r10.setRadius(r11)
            r10 = 2131298170(0x7f09077a, float:1.8214306E38)
            android.view.View r10 = r8.findViewById(r10)
            r11 = 2131309768(0x7f0934c8, float:1.823783E38)
            android.view.View r11 = r8.findViewById(r11)
            boolean r12 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r12 == 0) goto L_0x0069
            r12 = 2131234979(0x7f0810a3, float:1.808614E38)
            r11.setBackgroundResource(r12)
            goto L_0x006f
        L_0x0069:
            r12 = 2131234980(0x7f0810a4, float:1.8086141E38)
            r11.setBackgroundResource(r12)
        L_0x006f:
            r12 = 2131299373(0x7f090c2d, float:1.8216746E38)
            android.view.View r12 = r11.findViewById(r12)
            com.tencent.mm.ui.widget.MMRoundCornerImageView r12 = (com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView) r12
            r13 = 2131299377(0x7f090c31, float:1.8216754E38)
            android.view.View r13 = r11.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r14 = 2131299378(0x7f090c32, float:1.8216756E38)
            android.view.View r14 = r11.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r15 = 2131299375(0x7f090c2f, float:1.821675E38)
            android.view.View r15 = r11.findViewById(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            android.content.Context r16 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r16.getResources()
            r9 = 2131234174(0x7f080d7e, float:1.8084506E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r9)
            r12.setImageDrawable(r3)
            boolean r3 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r3 == 0) goto L_0x00bd
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r9 = 2131234173(0x7f080d7d, float:1.8084504E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r9)
            r12.setImageDrawable(r3)
        L_0x00bd:
            java.lang.String r3 = r2.mo93550m()
            r14.setText(r3)
            java.lang.String r3 = r2.mo93548k()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            java.lang.String r9 = ""
            if (r3 != 0) goto L_0x00db
            java.lang.String r3 = r2.mo93548k()
            r13.setText(r3)
            r13.setVisibility(r6)
            goto L_0x00e3
        L_0x00db:
            r13.setText(r9)
            r3 = 8
            r13.setVisibility(r3)
        L_0x00e3:
            java.lang.String r3 = r4.f212523f
            java.lang.String r4 = r4.f212524g
            boolean r17 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r17 != 0) goto L_0x0177
            android.view.ViewGroup$LayoutParams r9 = r14.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            android.content.Context r14 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 6
            int r6 = kg3.C76577a.m92151b(r14, r6)
            r9.topMargin = r6
            android.view.ViewGroup$LayoutParams r6 = r13.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r13 = 2
            int r9 = kg3.C76577a.m92151b(r9, r13)
            r6.topMargin = r9
            r6 = 2131310717(0x7f09387d, float:1.8239754E38)
            android.view.View r6 = r11.findViewById(r6)
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            r13 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r9.mo10233c(r14)
            java.lang.Object[] r19 = r9.mo10232b()
            java.lang.String r20 = "com/tencent/mm/pluginsdk/ui/applet/MusicMVRecentForwardUtils"
            java.lang.String r21 = "initMusicPieceDialog"
            java.lang.String r22 = "(Ljava/lang/String;Lcom/tencent/mm/message/AppMessage$Content;Lcom/tencent/mm/pluginsdk/ui/tools/AppContentMusicPiece;Landroid/content/Context;)Landroid/view/View;"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r6
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r13 = 0
            java.lang.Object r9 = r9.mo10231a(r13)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r6.setVisibility(r9)
            java.lang.String r19 = "com/tencent/mm/pluginsdk/ui/applet/MusicMVRecentForwardUtils"
            java.lang.String r20 = "initMusicPieceDialog"
            java.lang.String r21 = "(Ljava/lang/String;Lcom/tencent/mm/message/AppMessage$Content;Lcom/tencent/mm/pluginsdk/ui/tools/AppContentMusicPiece;Landroid/content/Context;)Landroid/view/View;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r4 = 2131833324(0x7f1131ec, float:1.9299727E38)
            java.lang.String r4 = r0.getString(r4)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r15.setText(r4)
            r4 = 0
            r15.setVisibility(r4)
            goto L_0x0180
        L_0x0177:
            r4 = 0
            r15.setText(r9)
            r6 = 8
            r15.setVisibility(r6)
        L_0x0180:
            r6 = 1
            boolean[] r9 = new boolean[r6]
            r9[r4] = r4
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x01b6
            hc0.c$b r2 = new hc0.c$b
            r2.<init>()
            java.lang.String r4 = za2.C102984b.m136166c(r3)
            r2.f59350f = r4
            r2.f59346b = r6
            r2.f59364t = r6
            r2.f59345a = r6
            r4 = 2
            int r4 = kg3.C76577a.m92151b(r0, r4)
            float r4 = (float) r4
            r2.f59365u = r4
            hc0.c r2 = r2.mo32666a()
            gc0.a r4 = gc0.C20828a.m22825b()
            wd3.a1 r6 = new wd3.a1
            r6.<init>(r5, r0, r10, r9)
            r4.mo32520i(r3, r12, r2, r6)
            goto L_0x0250
        L_0x01b6:
            boolean r2 = r2.mo93553p()
            if (r2 != 0) goto L_0x0242
            eb0.c r2 = eb0.C97625j3.m125812b()
            boolean r2 = r2.mo105883I()
            if (r2 == 0) goto L_0x0242
            di3.d r2 = di3.C86312j.m106911c(r7)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            r3 = r30
            java.lang.String r2 = r2.h30(r3)
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r4 != 0) goto L_0x01e0
            r4 = 0
            goto L_0x01fe
        L_0x01e0:
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            r5 = 1
            r4.inJustDecodeBounds = r5
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r2, r4)
            int r5 = r4.outWidth
            int r4 = r4.outHeight
            int r5 = r5 * r4
            r4 = 1048576(0x100000, float:1.469368E-39)
            if (r5 <= r4) goto L_0x01f8
            r4 = 1
            goto L_0x01f9
        L_0x01f8:
            r4 = 0
        L_0x01f9:
            if (r2 == 0) goto L_0x01fe
            r2.recycle()
        L_0x01fe:
            if (r4 != 0) goto L_0x0223
            di3.d r2 = di3.C86312j.m106911c(r7)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            r20 = 1
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            float r21 = kg3.C76577a.m92156g(r4)
            r22 = 0
            r23 = 1
            r18 = r2
            com.tencent.mm.modelimage.m r18 = (com.tencent.p014mm.modelimage.C92839m) r18
            r19 = r30
            android.graphics.Bitmap r2 = r18.mo127167Lo(r19, r20, r21, r22, r23)
            goto L_0x0224
        L_0x0223:
            r2 = 0
        L_0x0224:
            if (r2 == 0) goto L_0x023d
            boolean r4 = r2.isRecycled()
            if (r4 != 0) goto L_0x023d
            r12.setImageBitmap(r2)
            byte[] r3 = r30.getBytes()
            java.lang.String r3 = p823sg.C90193h.m112878f(r3)
            com.tencent.mm.plugin.comm.g r4 = com.tencent.p014mm.plugin.comm.C55593g.f158270a
            r4.mo77114b(r0, r10, r2, r3)
            goto L_0x0250
        L_0x023d:
            r0 = 1
            r2 = 0
            r9[r2] = r0
            goto L_0x0250
        L_0x0242:
            android.content.res.Resources r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r2 = 2131234285(0x7f080ded, float:1.8084731E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r2)
            r12.setImageBitmap(r0)
        L_0x0250:
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r2 = -1
            r3 = -2
            r0.<init>(r2, r3)
            r11.setLayoutParams(r0)
            r1.mo108565c(r8)
            r0 = 0
            r1.mo108570h(r0)
            goto L_0x0263
        L_0x0262:
            r0 = 0
        L_0x0263:
            r2 = r28
            r1.mo108578p(r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.mo108569g(r2)
            r1.mo108570h(r0)
            r0 = 2131821677(0x7f11046d, float:1.9276104E38)
            r1.mo108573k(r0)
            r0 = r31
            r1.mo108563a(r0)
            qo3.g r0 = r1.f230207c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wd3.C78552c0.Tm0(android.content.Context, java.lang.String, java.lang.String, java.lang.String, wd3.v0):qo3.g");
    }

    /* renamed from: Xn */
    public void mo108493Xn(Context context, String str, String str2, String str3, C65953v0 v0Var) {
        EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(str2);
        C78575u.C78583h hVar = new C78575u.C78583h(context);
        hVar.mo108578p(str);
        hVar.mo108568f(TO, str3);
        hVar.mo108569g(Boolean.FALSE);
        hVar.mo108573k(C0966R.string.a2s);
        hVar.mo108577o(context.getResources().getString(C0966R.string.i4c));
        hVar.mo108563a(v0Var);
        hVar.mo108574l();
    }

    public void cu0(Context context, String str, String str2, String str3, String str4, String str5, C65953v0 v0Var) {
        Class cls = C92054g.class;
        ((C92054g) C86312j.m106911c(cls)).getClass();
        EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(str2);
        String q = EmojiLogic.m117486q(((C67305d1) C86312j.m106911c(C67305d1.class)).rx0(), "", str2);
        if (TO == null) {
            int i = ImgUtil.isGif(q) ? 2 : 1;
            EmojiInfo emojiInfo = new EmojiInfo();
            emojiInfo.field_md5 = str2;
            emojiInfo.field_catalog = 65;
            emojiInfo.field_type = i;
            emojiInfo.field_size = (int) C86013q1.m106451l(q);
            emojiInfo.field_temp = 1;
            emojiInfo.field_designerID = str3;
            emojiInfo.field_thumbUrl = str5;
            ((C92054g) C86312j.m106911c(cls)).getClass();
            C30790w2.m39221h().mo57717d().mo142040Ow(emojiInfo);
            TO = emojiInfo;
        }
        C78575u.C78583h hVar = new C78575u.C78583h(context);
        hVar.mo108568f(TO, str4);
        hVar.mo108569g(Boolean.FALSE);
        hVar.f230208d = context.getString(C0966R.string.f7929wj);
        hVar.mo108563a(v0Var);
        hVar.mo108574l();
    }

    /* renamed from: hG */
    public C77398g mo108495hG(Context context, String str, String str2, String str3, C65953v0 v0Var) {
        C78575u.C78583h hVar = new C78575u.C78583h(context);
        hVar.mo108578p(str);
        hVar.mo108571i(str2);
        hVar.mo108569g(Boolean.TRUE);
        hVar.f230208d = str3;
        hVar.mo108563a(v0Var);
        return hVar.f230207c;
    }

    public C77398g jb0(Context context, String str, View view, String str2, C65953v0 v0Var) {
        C78575u.C78583h hVar = new C78575u.C78583h(context);
        hVar.mo108578p(str);
        hVar.mo108565c(view);
        hVar.mo108569g(Boolean.TRUE);
        hVar.mo108570h(false);
        hVar.f230208d = str2;
        hVar.mo108563a(v0Var);
        return hVar.f230207c;
    }

    public void or0(MMActivityController mMActivityController, String str, String str2, String str3, C65953v0 v0Var) {
        C78575u.C78583h hVar = new C78575u.C78583h(mMActivityController.mo177096t());
        hVar.mo108578p(str);
        C77389a aVar = hVar.f230206b.f225714b;
        aVar.f225668y = true;
        aVar.f225669z = true;
        hVar.mo108571i(str2);
        hVar.mo108569g(Boolean.FALSE);
        hVar.f230208d = str3;
        hVar.mo108563a(v0Var);
        hVar.mo108574l();
    }

    public void ph0(Context context, String str, String str2, C65953v0 v0Var, C77398g.C77402i.C77404b bVar, DialogInterface.OnDismissListener onDismissListener) {
        C78575u.C78583h hVar = new C78575u.C78583h(context);
        hVar.mo108578p(str);
        hVar.mo108569g(Boolean.TRUE);
        hVar.mo108570h(false);
        hVar.mo108571i(str2);
        C77389a aVar = hVar.f230206b.f225714b;
        aVar.f225668y = false;
        aVar.f225669z = false;
        hVar.f230209e = onDismissListener;
        hVar.mo108564b(bVar);
        hVar.mo108573k(C0966R.string.a2s);
        hVar.mo108563a(new c0$$c(this, v0Var));
        C77398g gVar = hVar.f230207c;
        if (!(gVar == null && gVar.f225693g == null)) {
            ((C76622f) C86312j.m106911c(C76622f.class)).mo106874nK(hVar.f230207c.f225693g, str, false);
        }
        hVar.mo108574l();
    }
}
