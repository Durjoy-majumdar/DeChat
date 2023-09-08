package rs1;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import bl3.C39818r;
import bl3.C54492n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58684b;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import java.util.LinkedList;
import java.util.UUID;
import je1.C46547x1;
import je1.C60798d2;
import nj3.C76879j;
import o40.C61926c;
import p749xh.C66276va;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C49946j51;
import te3.C64392gc1;
import te3.C64417hb1;
import te3.C64488kb1;
import te3.C64519lb1;
import te3.C64719t23;
import te3.C64793w23;
import tq1.C64996a;
import up1.C65415e0;
import up1.C65426w0;
import zc1.C66785b;

/* renamed from: rs1.r6 */
public final class C63621r6 extends UIComponent {

    /* renamed from: d */
    public int f180385d = 1;

    /* renamed from: e */
    public int f180386e = 1;

    /* renamed from: f */
    public int f180387f;

    /* renamed from: g */
    public C46547x1 f180388g;

    /* renamed from: h */
    public C60798d2 f180389h;

    /* renamed from: i */
    public String f180390i;

    /* renamed from: rs1.r6$a */
    public static final class C63622a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C63621r6 f180391a;

        /* renamed from: b */
        public final /* synthetic */ C66276va f180392b;

        /* renamed from: c */
        public final /* synthetic */ int f180393c;

        public C63622a(C63621r6 r6Var, C66276va vaVar, int i) {
            this.f180391a = r6Var;
            this.f180392b = vaVar;
            this.f180393c = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:66:0x0152  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r31) {
            /*
                r30 = this;
                r0 = r30
                r1 = r31
                ob0.b$c r1 = (ob0.C89132b.C89134c) r1
                r2 = 0
                if (r1 == 0) goto L_0x01cb
                rs1.r6 r3 = r0.f180391a
                xh.va r4 = r0.f180392b
                int r11 = r0.f180393c
                int r5 = r1.f256793a
                r6 = 0
                if (r5 != 0) goto L_0x0018
                int r7 = r1.f256794b
                if (r7 == 0) goto L_0x0022
            L_0x0018:
                er1.j4 r7 = er1.C58739j4.f168176a
                int r8 = r1.f256794b
                boolean r5 = r7.mo83681J(r5, r8)
                if (r5 == 0) goto L_0x019a
            L_0x0022:
                T r5 = r1.f256796d
                te3.jm0 r5 = (te3.C50008jm0) r5
                com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.f136184e
                if (r5 == 0) goto L_0x01cc
                java.lang.String r7 = "SimpleUIComponent"
                java.lang.String r8 = "get feed detail success"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
                com.tencent.mm.protocal.protobuf.FinderContact r7 = new com.tencent.mm.protocal.protobuf.FinderContact
                r7.<init>()
                com.tencent.mm.protocal.protobuf.FinderContact r8 = r5.contact
                if (r8 == 0) goto L_0x003d
                java.lang.String r9 = r8.username
                goto L_0x003e
            L_0x003d:
                r9 = r2
            L_0x003e:
                r7.username = r9
                if (r8 == 0) goto L_0x0045
                java.lang.String r9 = r8.nickname
                goto L_0x0046
            L_0x0045:
                r9 = r2
            L_0x0046:
                r7.nickname = r9
                if (r8 == 0) goto L_0x004d
                java.lang.String r9 = r8.headUrl
                goto L_0x004e
            L_0x004d:
                r9 = r2
            L_0x004e:
                r7.headUrl = r9
                if (r8 == 0) goto L_0x0055
                com.tencent.mm.protocal.protobuf.FinderAuthInfo r9 = r8.authInfo
                goto L_0x0056
            L_0x0055:
                r9 = r2
            L_0x0056:
                r7.authInfo = r9
                if (r8 == 0) goto L_0x005d
                te3.ii0 r8 = r8.extInfo
                goto L_0x005e
            L_0x005d:
                r8 = r2
            L_0x005e:
                r7.extInfo = r8
                fe1.d$b r8 = fe1.C58961d.f168673a
                r9 = 2
                fe1.C58961d.C58963b.m68837m(r8, r7, r6, r9, r2)
                com.tencent.mm.plugin.finder.storage.FinderItem$a r7 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
                r8 = 32
                com.tencent.mm.plugin.finder.storage.FinderItem r15 = r7.mo79056a(r5, r8)
                vp1.e r7 = vp1.C65834e.f189316a
                vp1.e$b r8 = vp1.C65834e.C65836b.f189330j
                r7.mo89878l(r15, r8)
                up1.f r7 = up1.C37521f.f99374d
                r7.getClass()
                pe1.c<java.lang.Integer> r7 = up1.C37521f.f99288T0
                java.lang.Object r7 = r7.mo60266n()
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                r12 = 0
                r8 = 3
                r10 = 1
                if (r7 != r10) goto L_0x00e2
                int r7 = r4.field_type
                if (r7 == r8) goto L_0x0098
                if (r7 != r9) goto L_0x00e2
                long r6 = r4.field_commentId
                int r14 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
                if (r14 == 0) goto L_0x00e2
            L_0x0098:
                int r2 = r5.objectType
                if (r2 != r9) goto L_0x00a3
                long r6 = r4.field_commentId
                rs1.C63621r6.m74940d3(r3, r10, r5, r6)
                goto L_0x01cc
            L_0x00a3:
                com.tencent.mm.plugin.finder.view.e1$a r5 = com.tencent.p014mm.plugin.finder.view.C56597e1.f162252i
                long r6 = r4.field_id
                int r8 = r4.field_createTime
                androidx.appcompat.app.AppCompatActivity r2 = r3.getActivity()
                java.lang.String r9 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
                gy3.C87412m.m108592e(r2, r9)
                r9 = r2
                com.tencent.mm.ui.MMActivity r9 = (com.tencent.p014mm.p136ui.MMActivity) r9
                int r10 = r3.f180385d
                r12 = 0
                r13 = 32
                r14 = 0
                com.tencent.mm.plugin.finder.view.e1 r12 = com.tencent.p014mm.plugin.finder.view.C56597e1.C56598a.m65270a(r5, r6, r8, r9, r10, r11, r12, r13, r14)
                r14 = 0
                long r2 = r4.field_commentId
                r4 = r15
                r15 = r2
                r17 = 1
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r26 = 0
                r27 = 0
                r28 = 8178(0x1ff2, float:1.146E-41)
                r29 = 0
                r13 = r4
                com.tencent.p014mm.plugin.finder.view.C56597e1.m65265e(r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29)
                goto L_0x01cc
            L_0x00e2:
                int r6 = r5.objectType
                if (r6 != r9) goto L_0x0102
                int r2 = r4.field_type
                if (r2 == r8) goto L_0x00fb
                if (r2 != r9) goto L_0x00f3
                long r6 = r4.field_commentId
                int r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
                if (r2 == 0) goto L_0x00f3
                goto L_0x00fb
            L_0x00f3:
                long r6 = r4.field_commentId
                r2 = 0
                rs1.C63621r6.m74940d3(r3, r2, r5, r6)
                goto L_0x01cc
            L_0x00fb:
                long r6 = r4.field_commentId
                rs1.C63621r6.m74940d3(r3, r10, r5, r6)
                goto L_0x01cc
            L_0x0102:
                android.content.Intent r6 = new android.content.Intent
                r6.<init>()
                int r7 = r3.f180385d
                if (r7 != r10) goto L_0x0126
                com.tencent.mm.protocal.protobuf.FinderContact r7 = r5.contact
                if (r7 == 0) goto L_0x0112
                java.lang.String r7 = r7.username
                goto L_0x0113
            L_0x0112:
                r7 = r2
            L_0x0113:
                java.lang.String r8 = r3.f180390i
                if (r8 == 0) goto L_0x011f
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r7, (java.lang.String) r8)
                if (r2 == 0) goto L_0x0126
                r2 = 1
                goto L_0x0127
            L_0x011f:
                java.lang.String r1 = "username"
                gy3.C87412m.m108603p(r1)
                throw r2
            L_0x0126:
                r2 = 0
            L_0x0127:
                er1.w3 r7 = er1.C58784w3.f168295a
                int r8 = r3.f180385d
                int r9 = r3.f180387f
                r7.mo83873H1(r6, r8, r9)
                long r7 = r4.field_objectId
                java.lang.String r9 = "feed_object_id"
                r6.putExtra(r9, r7)
                long r7 = r4.field_id
                java.lang.String r9 = "mention_id"
                r6.putExtra(r9, r7)
                int r7 = r4.field_createTime
                java.lang.String r8 = "mention_create_time"
                r6.putExtra(r8, r7)
                int r7 = r3.f180385d
                java.lang.String r8 = "from_scene"
                r6.putExtra(r8, r7)
                int r4 = r4.field_type
                r7 = 5
                if (r4 != r7) goto L_0x0152
                goto L_0x0153
            L_0x0152:
                r10 = 0
            L_0x0153:
                java.lang.String r4 = "force_show_ad_tip"
                r6.putExtra(r4, r10)
                com.tencent.mm.protocal.protobuf.FinderContact r4 = r5.contact
                java.lang.String r7 = ""
                if (r4 == 0) goto L_0x0162
                java.lang.String r4 = r4.username
                if (r4 != 0) goto L_0x0163
            L_0x0162:
                r4 = r7
            L_0x0163:
                java.lang.String r8 = "feed_username"
                r6.putExtra(r8, r4)
                java.lang.String r4 = "feed_is_self"
                r6.putExtra(r4, r2)
                com.tencent.mm.protocal.protobuf.FinderContact r4 = r5.contact
                if (r4 == 0) goto L_0x0177
                java.lang.String r4 = r4.username
                if (r4 != 0) goto L_0x0176
                goto L_0x0177
            L_0x0176:
                r7 = r4
            L_0x0177:
                java.lang.String r4 = "finder_username"
                r6.putExtra(r4, r7)
                java.lang.String r4 = "KEY_FINDER_SELF_FLAG"
                r6.putExtra(r4, r2)
                rs1.s8$a r2 = rs1.C13442s8.f38060Q0
                android.app.Activity r4 = r3.getContext()
                r2.mo12871c(r4, r6)
                java.lang.Class<er1.b> r2 = er1.C58684b.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                er1.b r2 = (er1.C58684b) r2
                androidx.appcompat.app.AppCompatActivity r3 = r3.getActivity()
                r2.Sx0(r3, r6)
                goto L_0x01cc
            L_0x019a:
                int r2 = r1.f256794b
                r4 = -4011(0xfffffffffffff055, float:NaN)
                if (r2 != r4) goto L_0x01ac
                androidx.appcompat.app.AppCompatActivity r2 = r3.getActivity()
                r3 = 2131826557(0x7f11177d, float:1.9286002E38)
                r4 = 0
                nj3.C76879j.m92738i(r2, r3, r4)
                goto L_0x01cc
            L_0x01ac:
                r4 = 0
                r5 = -4033(0xfffffffffffff03f, float:NaN)
                if (r2 != r5) goto L_0x01bc
                androidx.appcompat.app.AppCompatActivity r2 = r3.getActivity()
                r3 = 2131826641(0x7f1117d1, float:1.9286172E38)
                nj3.C76879j.m92738i(r2, r3, r4)
                goto L_0x01cc
            L_0x01bc:
                r5 = -4036(0xfffffffffffff03c, float:NaN)
                if (r2 != r5) goto L_0x01cc
                androidx.appcompat.app.AppCompatActivity r2 = r3.getActivity()
                r3 = 2131829851(0x7f11245b, float:1.9292683E38)
                nj3.C76879j.m92738i(r2, r3, r4)
                goto L_0x01cc
            L_0x01cb:
                r1 = r2
            L_0x01cc:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C63621r6.C63622a.call(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63621r6(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: c3 */
    public static final void m74939c3(C63621r6 r6Var, int i) {
        switch (i) {
            case -8003:
                C76879j.m92738i(r6Var.getActivity(), C0966R.string.eoh, 0);
                return;
            case -8002:
                C76879j.m92738i(r6Var.getActivity(), C0966R.string.d_8, 0);
                return;
            case -8001:
                C76879j.m92738i(r6Var.getActivity(), C0966R.string.f360503d90, 0);
                return;
            default:
                r6Var.getClass();
                return;
        }
    }

    /* renamed from: d3 */
    public static final void m74940d3(C63621r6 r6Var, boolean z, FinderObject finderObject, long j) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        String str7;
        C64417hb1 hb12;
        C64488kb1 kb12;
        C64519lb1 lb12;
        C64417hb1 hb13;
        C64488kb1 kb13;
        C64417hb1 hb14;
        C64488kb1 kb14;
        C64417hb1 hb15;
        C64488kb1 kb15;
        C64417hb1 hb16;
        C64488kb1 kb16;
        C64417hb1 hb17;
        C64488kb1 kb17;
        C64417hb1 hb18;
        C64488kb1 kb18;
        C64417hb1 hb19;
        C64488kb1 kb19;
        C64417hb1 hb110;
        C64488kb1 kb110;
        C64417hb1 hb111;
        C64488kb1 kb111;
        C64417hb1 hb112;
        C64488kb1 kb112;
        C64417hb1 hb113;
        C64488kb1 kb113;
        C64417hb1 hb114;
        C64488kb1 kb114;
        C64519lb1 lb13;
        C64417hb1 hb115;
        C64488kb1 kb115;
        C64417hb1 hb116;
        C64488kb1 kb116;
        C64417hb1 hb117;
        C64488kb1 kb117;
        LinkedList<FinderMedia> linkedList;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        int i2;
        String str14;
        String str15;
        String str16;
        String str17;
        C64417hb1 hb118;
        C64488kb1 kb118;
        C64417hb1 hb119;
        C64488kb1 kb119;
        C64417hb1 hb120;
        C64488kb1 kb120;
        C64417hb1 hb121;
        C64488kb1 kb121;
        C64417hb1 hb122;
        C64488kb1 kb122;
        C64417hb1 hb123;
        C64488kb1 kb123;
        C64417hb1 hb124;
        C64488kb1 kb124;
        C64417hb1 hb125;
        C64488kb1 kb125;
        C64417hb1 hb126;
        C64488kb1 kb126;
        C64417hb1 hb127;
        C64488kb1 kb127;
        C64417hb1 hb128;
        C64488kb1 kb128;
        C64417hb1 hb129;
        C64488kb1 kb129;
        C64417hb1 hb130;
        C64488kb1 kb130;
        C64417hb1 hb131;
        C64488kb1 kb131;
        C64519lb1 lb14;
        C64417hb1 hb132;
        C64488kb1 kb132;
        C64417hb1 hb133;
        C64488kb1 kb133;
        C64417hb1 hb134;
        C64488kb1 kb134;
        FinderObjectDesc finderObjectDesc;
        C64417hb1 hb135;
        C64488kb1 kb135;
        LinkedList<FinderMedia> linkedList2;
        FinderMedia finderMedia;
        C63621r6 r6Var2 = r6Var;
        boolean z2 = z;
        FinderObject finderObject2 = finderObject;
        long j2 = j;
        int i3 = r6Var2.f180385d;
        Class<C58684b> cls = C58684b.class;
        String str18 = "key_mv_report_data";
        Class<C13442s8> cls2 = C13442s8.class;
        String str19 = "randomUUID().toString()";
        String str20 = C54492n.TAG;
        String str21 = "jump to musicMvMainUI";
        String str22 = "key_mv_song_mid";
        C13598b0 b0Var = null;
        String str23 = "key_mv_music_operation_url";
        String str24 = "key_mv_album_cover_url";
        String str25 = "key_mv_issue_date";
        String str26 = "key_mv_music_genre";
        String str27 = "key_mv_album_name";
        String str28 = "key_mv_singer_name";
        String str29 = "key_mv_song_lyric";
        String str30 = "key_mv_song_name";
        if (i3 == 2) {
            FinderObjectDesc finderObjectDesc2 = finderObject2.objectDesc;
            if (finderObjectDesc2 == null || (linkedList2 = finderObjectDesc2.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList2)) == null) {
                str8 = "key_mv_music_duration";
                str9 = null;
            } else {
                StringBuilder sb = new StringBuilder();
                str8 = "key_mv_music_duration";
                sb.append(finderMedia.thumbUrl);
                sb.append(finderMedia.thumb_url_token);
                str9 = sb.toString();
            }
            if (!(!(str9 == null || str9.length() == 0) || (finderObjectDesc = finderObject2.objectDesc) == null || (hb135 = finderObjectDesc.mvInfo) == null || (kb135 = hb135.f183456e) == null || (str9 = kb135.f183912o) != null)) {
                str9 = "";
            }
            FinderContact finderContact = finderObject2.contact;
            String str31 = finderContact != null ? finderContact.nickname : null;
            C64719t23 t232 = new C64719t23();
            String str32 = "key_mv_identification";
            String str33 = "key_mv_extra_info";
            long j3 = finderObject2.f164794id;
            C64719t23 t233 = t232;
            String str34 = finderObject2.objectNonceId;
            if (str9 == null || str31 == null || str34 == null) {
                str10 = str20;
            } else {
                Intent intent = new Intent();
                intent.putExtra("key_mv_cover_url", str9);
                intent.putExtra("key_mv_feed_id", C61926c.m72691p(j3));
                intent.putExtra("key_mv_nonce_id", str34);
                intent.putExtra("key_mv_poster", str31);
                intent.putExtra("key_launch_mv_comment", z2);
                intent.putExtra("key_refer_mv_comment_id", j2);
                C58784w3.f168295a.mo83873H1(intent, r6Var2.f180385d, r6Var2.f180387f);
                intent.putExtra("key_need_update_music_ball_url", true);
                Intent intent2 = intent;
                finderObject2 = finderObject;
                FinderObjectDesc finderObjectDesc3 = finderObject2.objectDesc;
                if (finderObjectDesc3 == null || (hb134 = finderObjectDesc3.mvInfo) == null || (kb134 = hb134.f183456e) == null || (str11 = kb134.f183916s) == null) {
                    str11 = "";
                }
                String str35 = str33;
                intent2.putExtra(str35, str11);
                FinderObjectDesc finderObjectDesc4 = finderObject2.objectDesc;
                if (finderObjectDesc4 == null || (hb133 = finderObjectDesc4.mvInfo) == null || (kb133 = hb133.f183456e) == null || (str12 = kb133.f183917t) == null) {
                    str12 = "";
                }
                String str36 = str32;
                intent2.putExtra(str36, str12);
                FinderObjectDesc finderObjectDesc5 = finderObject2.objectDesc;
                if (finderObjectDesc5 == null || (hb132 = finderObjectDesc5.mvInfo) == null || (kb132 = hb132.f183456e) == null) {
                    str13 = str8;
                    i2 = 0;
                } else {
                    i2 = kb132.f183918u;
                    str13 = str8;
                }
                intent2.putExtra(str13, i2);
                FinderObjectDesc finderObjectDesc6 = finderObject2.objectDesc;
                if (finderObjectDesc6 == null || (hb131 = finderObjectDesc6.mvInfo) == null || (kb131 = hb131.f183456e) == null || (lb14 = kb131.f183921x) == null || (str14 = lb14.f184069d) == null) {
                    str14 = "";
                }
                String str37 = str23;
                intent2.putExtra(str37, str14);
                FinderObjectDesc finderObjectDesc7 = finderObject2.objectDesc;
                if (finderObjectDesc7 == null || (hb130 = finderObjectDesc7.mvInfo) == null || (kb130 = hb130.f183456e) == null || (str16 = kb130.f183922y) == null) {
                    str15 = str22;
                    str16 = "";
                } else {
                    str15 = str22;
                }
                intent2.putExtra(str15, str16);
                String p = C61926c.m72691p(j3);
                C64719t23 t234 = t233;
                t234.f185459d = p;
                t234.f185460e = str34;
                t234.f185461f = str9;
                t234.f185462g = str31;
                FinderObjectDesc finderObjectDesc8 = finderObject2.objectDesc;
                t234.f185463h = (finderObjectDesc8 == null || (hb129 = finderObjectDesc8.mvInfo) == null || (kb129 = hb129.f183456e) == null) ? null : kb129.f183905e;
                t234.f185464i = (finderObjectDesc8 == null || (hb128 = finderObjectDesc8.mvInfo) == null || (kb128 = hb128.f183456e) == null) ? null : kb128.f183911n;
                t234.f185465j = (finderObjectDesc8 == null || (hb127 = finderObjectDesc8.mvInfo) == null || (kb127 = hb127.f183456e) == null) ? null : kb127.f183916s;
                t234.f185466n = (finderObjectDesc8 == null || (hb126 = finderObjectDesc8.mvInfo) == null || (kb126 = hb126.f183456e) == null) ? null : kb126.f183913p;
                t234.f185467o = (finderObjectDesc8 == null || (hb125 = finderObjectDesc8.mvInfo) == null || (kb125 = hb125.f183456e) == null) ? 0 : kb125.f183915r;
                t234.f185468p = (finderObjectDesc8 == null || (hb124 = finderObjectDesc8.mvInfo) == null || (kb124 = hb124.f183456e) == null) ? null : kb124.f183905e;
                t234.f185469q = (finderObjectDesc8 == null || (hb123 = finderObjectDesc8.mvInfo) == null || (kb123 = hb123.f183456e) == null) ? 0 : kb123.f183918u;
                t234.f185473u = (finderObjectDesc8 == null || (hb122 = finderObjectDesc8.mvInfo) == null || (kb122 = hb122.f183456e) == null) ? null : kb122.f183904d;
                t234.f185474v = (finderObjectDesc8 == null || (hb121 = finderObjectDesc8.mvInfo) == null || (kb121 = hb121.f183456e) == null) ? null : kb121.f183910j;
                t234.f185475w = (finderObjectDesc8 == null || (hb120 = finderObjectDesc8.mvInfo) == null || (kb120 = hb120.f183456e) == null) ? null : kb120.f183912o;
                if (finderObjectDesc8 == null || (hb119 = finderObjectDesc8.mvInfo) == null || (kb119 = hb119.f183456e) == null || (str17 = kb119.f183922y) == null) {
                    str17 = "";
                }
                t234.f185470r = str17;
                t234.f185472t = str9;
                str10 = str20;
                Log.m105924i(str10, str21);
                FinderObjectDesc finderObjectDesc9 = finderObject2.objectDesc;
                if (!(finderObjectDesc9 == null || (hb118 = finderObjectDesc9.mvInfo) == null || (kb118 = hb118.f183456e) == null)) {
                    C65415e0.f188260a.mo89507e(kb118, C61926c.m72691p(finderObject2.f164794id), 13, t234);
                }
                C64793w23 w232 = new C64793w23();
                String uuid = UUID.randomUUID().toString();
                C87412m.m108593f(uuid, str19);
                w232.f186034e = uuid;
                w232.f186035f = 86;
                w232.f186036g = C61926c.m72691p(finderObject2.f164794id);
                w232.f186033d = 5;
                w232.f186038i = ((C13442s8) C39818r.f106831a.mo62443b(r6Var.getContext()).mo75002a(cls2)).f38098n;
                intent2.putExtra(str18, w232.toByteArray());
                String str38 = t234.f185473u;
                if (str38 == null) {
                    str38 = "";
                }
                intent2.putExtra(str30, str38);
                String str39 = t234.f185474v;
                if (str39 == null) {
                    str39 = "";
                }
                intent2.putExtra(str29, str39);
                String str40 = t234.f185463h;
                if (str40 == null) {
                    str40 = "";
                }
                intent2.putExtra(str28, str40);
                String str41 = t234.f185464i;
                if (str41 == null) {
                    str41 = "";
                }
                intent2.putExtra(str27, str41);
                String str42 = t234.f185466n;
                if (str42 == null) {
                    str42 = "";
                }
                intent2.putExtra(str26, str42);
                intent2.putExtra(str25, String.valueOf(t234.f185467o));
                String str43 = t234.f185475w;
                if (str43 == null) {
                    str43 = "";
                }
                intent2.putExtra(str24, str43);
                String str44 = t234.f185468p;
                if (str44 == null) {
                    str44 = "";
                }
                intent2.putExtra(str36, str44);
                String str45 = t234.f185465j;
                if (str45 == null) {
                    str45 = "";
                }
                intent2.putExtra(str35, str45);
                intent2.putExtra(str13, t234.f185469q);
                intent2.putExtra(str37, t234.f185471s);
                intent2.putExtra(str15, t234.f185470r);
                ((C58684b) C86312j.m106911c(cls)).jy0(r6Var.getContext(), intent2);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105924i(str10, "jump to musicMvMainUI error " + str9 + ' ' + str31 + ' ' + finderObject2.f164794id + ' ' + finderObject2.objectNonceId);
                return;
            }
            return;
        }
        String str46 = "key_mv_extra_info";
        String str47 = str22;
        String str48 = str23;
        String str49 = str24;
        String str50 = str25;
        String str51 = str26;
        String str52 = str27;
        String str53 = str28;
        String str54 = str29;
        String str55 = str30;
        FinderObjectDesc finderObjectDesc10 = finderObject2.objectDesc;
        FinderMedia finderMedia2 = (finderObjectDesc10 == null || (linkedList = finderObjectDesc10.media) == null) ? null : (FinderMedia) C110818d0.m150916N(linkedList);
        if (finderMedia2 != null) {
            str2 = str48;
            StringBuilder sb4 = new StringBuilder();
            str = "key_mv_music_duration";
            sb4.append(finderMedia2.thumbUrl);
            sb4.append(finderMedia2.thumb_url_token);
            str3 = sb4.toString();
        } else {
            str = "key_mv_music_duration";
            str2 = str48;
            str3 = "";
        }
        Intent intent3 = new Intent();
        String str56 = "key_mv_identification";
        intent3.putExtra("key_mv_finder_obj", finderObject.toByteArray());
        intent3.putExtra("key_launch_mv_comment", z2);
        intent3.putExtra("key_mv_feed_id", C61926c.m72691p(finderObject2.f164794id));
        intent3.putExtra("key_mv_nonce_id", finderObject2.objectNonceId);
        intent3.putExtra("key_refer_mv_comment_id", j2);
        intent3.putExtra("key_mv_cover_url", str3);
        FinderContact finderContact2 = finderObject2.contact;
        intent3.putExtra("key_mv_poster", finderContact2 != null ? finderContact2.nickname : null);
        C58784w3.f168295a.mo83873H1(intent3, r6Var2.f180385d, r6Var2.f180387f);
        FinderObjectDesc finderObjectDesc11 = finderObject2.objectDesc;
        if (finderObjectDesc11 == null || (hb117 = finderObjectDesc11.mvInfo) == null || (kb117 = hb117.f183456e) == null || (str4 = kb117.f183916s) == null) {
            str4 = "";
        }
        intent3.putExtra(str46, str4);
        FinderObjectDesc finderObjectDesc12 = finderObject2.objectDesc;
        if (finderObjectDesc12 == null || (hb116 = finderObjectDesc12.mvInfo) == null || (kb116 = hb116.f183456e) == null || (str5 = kb116.f183917t) == null) {
            str5 = "";
        }
        String str57 = str56;
        intent3.putExtra(str57, str5);
        FinderObjectDesc finderObjectDesc13 = finderObject2.objectDesc;
        if (finderObjectDesc13 == null || (hb115 = finderObjectDesc13.mvInfo) == null || (kb115 = hb115.f183456e) == null) {
            str6 = str;
            i = 0;
        } else {
            i = kb115.f183918u;
            str6 = str;
        }
        intent3.putExtra(str6, i);
        FinderObjectDesc finderObjectDesc14 = finderObject2.objectDesc;
        if (finderObjectDesc14 == null || (hb114 = finderObjectDesc14.mvInfo) == null || (kb114 = hb114.f183456e) == null || (lb13 = kb114.f183921x) == null || (str7 = lb13.f184069d) == null) {
            str7 = "";
        }
        String str58 = str2;
        intent3.putExtra(str58, str7);
        C64719t23 t235 = new C64719t23();
        t235.f185459d = C61926c.m72691p(finderObject2.f164794id);
        t235.f185460e = finderObject2.objectNonceId;
        t235.f185461f = str3;
        FinderContact finderContact3 = finderObject2.contact;
        t235.f185462g = finderContact3 != null ? finderContact3.nickname : null;
        FinderObjectDesc finderObjectDesc15 = finderObject2.objectDesc;
        t235.f185463h = (finderObjectDesc15 == null || (hb113 = finderObjectDesc15.mvInfo) == null || (kb113 = hb113.f183456e) == null) ? null : kb113.f183905e;
        t235.f185464i = (finderObjectDesc15 == null || (hb112 = finderObjectDesc15.mvInfo) == null || (kb112 = hb112.f183456e) == null) ? null : kb112.f183911n;
        t235.f185465j = (finderObjectDesc15 == null || (hb111 = finderObjectDesc15.mvInfo) == null || (kb111 = hb111.f183456e) == null) ? null : kb111.f183916s;
        t235.f185466n = (finderObjectDesc15 == null || (hb110 = finderObjectDesc15.mvInfo) == null || (kb110 = hb110.f183456e) == null) ? null : kb110.f183913p;
        t235.f185467o = (finderObjectDesc15 == null || (hb19 = finderObjectDesc15.mvInfo) == null || (kb19 = hb19.f183456e) == null) ? 0 : kb19.f183915r;
        t235.f185468p = (finderObjectDesc15 == null || (hb18 = finderObjectDesc15.mvInfo) == null || (kb18 = hb18.f183456e) == null) ? null : kb18.f183917t;
        t235.f185469q = (finderObjectDesc15 == null || (hb17 = finderObjectDesc15.mvInfo) == null || (kb17 = hb17.f183456e) == null) ? 0 : kb17.f183918u;
        t235.f185473u = (finderObjectDesc15 == null || (hb16 = finderObjectDesc15.mvInfo) == null || (kb16 = hb16.f183456e) == null) ? null : kb16.f183904d;
        t235.f185474v = (finderObjectDesc15 == null || (hb15 = finderObjectDesc15.mvInfo) == null || (kb15 = hb15.f183456e) == null) ? null : kb15.f183910j;
        t235.f185475w = (finderObjectDesc15 == null || (hb14 = finderObjectDesc15.mvInfo) == null || (kb14 = hb14.f183456e) == null) ? null : kb14.f183912o;
        t235.f185470r = (finderObjectDesc15 == null || (hb13 = finderObjectDesc15.mvInfo) == null || (kb13 = hb13.f183456e) == null) ? null : kb13.f183922y;
        t235.f185472t = str3;
        t235.f185471s = (finderObjectDesc15 == null || (hb12 = finderObjectDesc15.mvInfo) == null || (kb12 = hb12.f183456e) == null || (lb12 = kb12.f183921x) == null) ? null : lb12.f184069d;
        Log.m105924i(str20, str21);
        C64793w23 w233 = new C64793w23();
        String uuid2 = UUID.randomUUID().toString();
        C87412m.m108593f(uuid2, str19);
        w233.f186034e = uuid2;
        w233.f186035f = 86;
        w233.f186036g = C61926c.m72691p(finderObject2.f164794id);
        w233.f186033d = 15;
        w233.f186038i = ((C13442s8) C39818r.f106831a.mo62443b(r6Var.getContext()).mo75002a(cls2)).f38098n;
        intent3.putExtra(str18, w233.toByteArray());
        String str59 = t235.f185473u;
        if (str59 == null) {
            str59 = "";
        }
        intent3.putExtra(str55, str59);
        String str60 = t235.f185474v;
        if (str60 == null) {
            str60 = "";
        }
        intent3.putExtra(str54, str60);
        String str61 = t235.f185463h;
        if (str61 == null) {
            str61 = "";
        }
        intent3.putExtra(str53, str61);
        String str62 = t235.f185464i;
        if (str62 == null) {
            str62 = "";
        }
        intent3.putExtra(str52, str62);
        String str63 = t235.f185466n;
        if (str63 == null) {
            str63 = "";
        }
        intent3.putExtra(str51, str63);
        intent3.putExtra(str50, String.valueOf(t235.f185467o));
        String str64 = t235.f185475w;
        if (str64 == null) {
            str64 = "";
        }
        intent3.putExtra(str49, str64);
        String str65 = t235.f185468p;
        if (str65 == null) {
            str65 = "";
        }
        intent3.putExtra(str57, str65);
        String str66 = t235.f185465j;
        if (str66 == null) {
            str66 = "";
        }
        intent3.putExtra(str46, str66);
        intent3.putExtra(str6, t235.f185469q);
        intent3.putExtra(str58, t235.f185471s);
        intent3.putExtra(str47, t235.f185470r);
        ((C58684b) C86312j.m106911c(cls)).jy0(r6Var.getContext(), intent3);
    }

    /* renamed from: e3 */
    public final void mo88463e3(C66276va vaVar) {
        String str;
        C89349b bVar;
        C66276va vaVar2 = vaVar;
        C58784w3 w3Var = C58784w3.f168295a;
        int i = this.f180385d;
        w3Var.getClass();
        boolean z = false;
        int i2 = i == 1 ? 7 : 5;
        C64392gc1 gc12 = vaVar2.field_extInfo;
        if (gc12 == null || (str = gc12.f183301d) == null) {
            str = "";
        }
        if (C87412m.m108589b(str, "music")) {
            C64392gc1 gc13 = vaVar2.field_extInfo;
            if (gc13 == null || (bVar = gc13.f183303f) == null) {
                Log.m105920e(C54492n.TAG, "jumpToMusic extBuff empty!");
            } else {
                C64996a aVar = C64996a.f187120a;
                byte[] bArr = bVar.f257327a;
                C87412m.m108593f(bArr, "it.bytes");
                long j = vaVar2.field_commentId;
                String str2 = vaVar2.field_extInfo.f183302e;
                aVar.mo89155a(bArr, j, str2 == null ? "" : str2, getContext());
                z = true;
            }
        }
        if (!z) {
            long j2 = vaVar2.field_objectId;
            String str3 = vaVar2.field_objectNonceId;
            int i3 = this.f180385d;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
            C46547x1 x1Var = new C46547x1(j2, str3, i2, i3, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, (String) null, f != null ? f.mo12861q3() : null, 0, (C49946j51) null, false, 122816, (C8480h) null);
            this.f180388g = x1Var;
            x1Var.mo9225i().mo123062e(new C63622a(this, vaVar2, i2));
        }
    }

    public void onCreate(Bundle bundle) {
        String O5;
        super.onCreate(bundle);
        String str = "";
        if (this.f180385d == 1 && (O5 = C66785b.f191882e.mo90662O5()) != null) {
            str = O5;
        }
        this.f180390i = str;
    }
}
