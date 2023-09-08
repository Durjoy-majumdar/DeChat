package com.tencent.p014mm.p136ui.chatting.component;

import android.content.DialogInterface;
import android.content.Intent;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct;
import com.tencent.p014mm.network.C114786m0;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI;
import com.tencent.p014mm.p136ui.chatting.manager.C6789c;
import com.tencent.p014mm.plugin.mmsight.SightCaptureResult;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.decode.model.C30396b;
import com.tencent.p014mm.plugin.sight.decode.model.SightPlayController;
import com.tencent.p014mm.pluginsdk.model.C96790t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import hd0.C76152m;
import hd0.C98398h0;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98429r0;
import i40.C98597b;
import i40.C98598e;
import ig3.C98692n;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import k20.C9556a;
import mh0.C99864d;
import mh0.C99865e0;
import nj3.C76879j;
import p159gw.C98250h;
import p232rw.C101475j;
import p270xi.C91212b;
import p682rz.C101485o;
import p682rz.C101488s;
import p682rz.C101491u;
import p740wo.C53193b;
import te3.C101783gu2;
import te3.tc4;
import zj3.C79359g1;
import zj3.C79368l;
import zj3.C79386v0;

@C91212b(exportInterface = C79359g1.class)
/* renamed from: com.tencent.mm.ui.chatting.component.z5 */
public class C73669z5 extends C73412a implements C79359g1 {

    /* renamed from: e */
    public SparseBooleanArray f216300e = new SparseBooleanArray();

    /* renamed from: F4 */
    public void mo26186F4() {
        Log.m105924i("MicroMsg.ChattingUI.VideoComponent", "[onChattingResume]");
        C79368l lVar = (C79368l) this.f215752d.f193278b.mo102812a(C79368l.class);
        ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137716b(lVar.mo108194f4(), C86709a0.m107525e().getLooper());
        ((C99865e0) C98597b.m128130c3((C98598e) C86312j.m106911c(C99864d.class), C99865e0.class)).f292640f.add(lVar.mo108203m5(), C86709a0.m107525e().getLooper());
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        Log.m105924i("MicroMsg.ChattingUI.VideoComponent", "[onChattingPause]");
        C79368l lVar = (C79368l) this.f215752d.f193278b.mo102812a(C79368l.class);
        ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137731u(lVar.mo108194f4());
        ((C99865e0) C98597b.m128130c3((C98598e) C86312j.m106911c(C99864d.class), C99865e0.class)).f292640f.remove(lVar.mo108203m5());
    }

    /* renamed from: N5 */
    public void mo70052N5(int i, int i2, Intent intent) {
        boolean z = false;
        if (intent == null) {
            Log.m105929w("MicroMsg.ChattingUI.VideoComponent", "dealWithRequestCode, request code:%d, data is null", Integer.valueOf(i));
            return;
        }
        String stringExtra = intent.getStringExtra("GalleryUI_ToUser");
        String r = this.f215752d.mo91577r();
        String str = Util.isNullOrNil(stringExtra) ? r : stringExtra;
        Log.m105925i("MicroMsg.ChattingUI.VideoComponent", "dealWithRequestCode, intentUser:%s, currentUser:%s", stringExtra, r);
        if (i == 208) {
            mo102711o2(intent, str);
        } else if (i != 218) {
            if (i == 226) {
                SightCaptureResult sightCaptureResult = (SightCaptureResult) intent.getParcelableExtra("key_req_result");
                if (sightCaptureResult == null) {
                    Log.m105928w("MicroMsg.ChattingUI.VideoComponent", "[dealWithRequestCode] REQUEST_SIGHT_CAPTURE! null == captureResult");
                } else if (!sightCaptureResult.f201515e) {
                    Class cls = C101488s.class;
                    Log.m105925i("MicroMsg.ChattingUI.VideoComponent", "video path %s thumb path %s", sightCaptureResult.f201517g, sightCaptureResult.f201518h);
                    String q = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137728q(sightCaptureResult.f201519i);
                    if (!sightCaptureResult.f201517g.equals(q)) {
                        Log.m105925i("MicroMsg.ChattingUI.VideoComponent", "filepath not videopath and move it %s %s", sightCaptureResult.f201517g, q);
                        C86013q1.m106442c(sightCaptureResult.f201517g, q);
                        ((C101475j) C86312j.m106911c(C101475j.class)).pt0(sightCaptureResult.f201517g);
                    }
                    String r2 = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137729r(sightCaptureResult.f201519i);
                    if (!sightCaptureResult.f201518h.equals(r2)) {
                        Log.m105925i("MicroMsg.ChattingUI.VideoComponent", "filepath not thumbPath and move it %s %s", sightCaptureResult.f201518h, r2);
                        C86013q1.m106463x(sightCaptureResult.f201518h, r2);
                    }
                    String str2 = sightCaptureResult.f201519i;
                    int i3 = sightCaptureResult.f201521n;
                    String r3 = this.f215752d.mo91577r();
                    C101783gu2 gu22 = sightCaptureResult.f201522o;
                    C98408n0 n0Var = new C98408n0();
                    n0Var.f288554a = str2;
                    n0Var.f288566m = i3;
                    n0Var.f288570q = r3;
                    n0Var.f288571r = (String) C86709a0.m107535s().mo121142i().mo119684e(2, "");
                    n0Var.f288563j = Util.nowSecond();
                    n0Var.f288564k = Util.nowSecond();
                    n0Var.f288538F = gu22;
                    n0Var.f288572s = 0;
                    n0Var.f288576w = 1;
                    int m = C98410o0.m127731m(C98398h0.Bx0().mo137728q(str2));
                    if (m <= 0) {
                        Log.m105920e("MicroMsg.VideoLogic", "get Video size failed :" + str2);
                    } else {
                        n0Var.f288559f = m;
                        String r4 = C98398h0.Bx0().mo137729r(str2);
                        int m2 = C98410o0.m127731m(r4);
                        if (m2 <= 0) {
                            Log.m105920e("MicroMsg.VideoLogic", "get Thumb size failed :" + r4 + " size:" + m2);
                        } else {
                            n0Var.f288561h = m2;
                            Log.m105924i("MicroMsg.VideoLogic", "prepareMMSightRecord file:" + str2 + " thumbsize:" + n0Var.f288561h + " videosize:" + n0Var.f288559f);
                            n0Var.f288562i = 102;
                            C72963f4 f4Var = new C72963f4();
                            f4Var.mo108749c3(n0Var.mo137707k());
                            f4Var.setType(43);
                            f4Var.mo108740T2(1);
                            f4Var.mo108739S2(str2);
                            f4Var.mo100991d(1);
                            f4Var.mo108733M2(C75604z3.m90843o(n0Var.mo137707k()));
                            n0Var.f288567n = (long) ((int) C75604z3.m90852x(f4Var));
                            z = C98398h0.Bx0().mo137730s(n0Var);
                        }
                    }
                    if (z) {
                        long l = C86013q1.m106451l(sightCaptureResult.f201517g);
                        C98692n.f289404a.mo138103d(this.f215752d.mo91577r(), sightCaptureResult.f201519i, 1000 * ((long) sightCaptureResult.f201521n), l, l, 1, false);
                        ((C101491u) C86312j.m106911c(C101491u.class)).mo140800Ic(sightCaptureResult.f201519i);
                        return;
                    }
                    Log.m105920e("MicroMsg.ChattingUI.VideoComponent", "prepareMMSightRecord failed");
                } else {
                    ((C79386v0) this.f215752d.f193278b.mo102812a(C79386v0.class)).mo102585D0(sightCaptureResult);
                }
            } else if (i == 215) {
                mo102711o2(intent, str);
            } else if (i == 216) {
                mo102709a6(intent);
            }
        } else if (intent.getBooleanExtra("from_record", false)) {
            mo102709a6(intent);
        } else {
            mo102711o2(intent, str);
        }
    }

    /* renamed from: Y5 */
    public final void mo102706Y5(Intent intent, String str) {
        C76152m mVar = new C76152m();
        mVar.mo106353a(this.f215752d.mo91565f(), intent, str, !intent.getBooleanExtra("CropImage_Compress_Img", true) && C98429r0.m127830u(), new z5$$e(this, str));
        C67391b bVar = this.f215752d;
        bVar.mo91552M(bVar.mo91565f(), this.f215752d.mo91572m().getString(C0966R.string.a3h), this.f215752d.mo91572m().getString(C0966R.string.a4d), true, true, new z5$$f(this, mVar));
    }

    /* renamed from: Z0 */
    public void mo102707Z0(Intent intent, String str) {
        if (intent != null) {
            String stringExtra = Util.isNullOrNil(str) ? intent.getStringExtra("GalleryUI_ToUser") : str;
            if (Util.isNullOrNil(stringExtra)) {
                stringExtra = this.f215752d.mo91577r();
            }
            boolean z = !intent.getBooleanExtra("CropImage_Compress_Img", true) && C98429r0.m127830u();
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("key_select_video_list");
            Log.m105925i("MicroMsg.ChattingUI.VideoComponent", "sendMultiVideo, toUser:%s external toUser:%s origin video:%b", stringExtra, str, Boolean.valueOf(z));
            if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
                Log.m105920e("MicroMsg.ChattingUI.VideoComponent", "send video list is null or nil");
            } else if (!C114786m0.m161568a(this.f215752d.mo91565f())) {
                mo102708Z5(stringArrayListExtra, z, stringExtra);
            } else {
                mo102708Z5(stringArrayListExtra, z, stringExtra);
            }
        }
    }

    /* renamed from: Z5 */
    public final void mo102708Z5(ArrayList<String> arrayList, boolean z, String str) {
        Log.m105925i("MicroMsg.ChattingUI.VideoComponent", "send video path: %s, toUser:%s, origin:%b", arrayList.toString(), str, Boolean.valueOf(z));
        C96790t0 t0Var = new C96790t0(this.f215752d.mo91565f(), arrayList, (Intent) null, str, 2, new z5$$b(this), z);
        C67391b bVar = this.f215752d;
        bVar.mo91552M(bVar.mo91565f(), this.f215752d.mo91572m().getString(C0966R.string.a3h), this.f215752d.mo91572m().getString(C0966R.string.a4d), true, true, new z5$$c(this, t0Var));
        ThreadPool.post(t0Var, "ChattingUI_importMultiVideo");
    }

    /* renamed from: a6 */
    public final void mo102709a6(Intent intent) {
        Intent intent2 = intent;
        Log.m105924i("MicroMsg.ChattingUI.VideoComponent", "sendVideoFromCustomRecord");
        if (intent2 == null) {
            Log.m105920e("MicroMsg.ChattingUI.VideoComponent", "data == null");
            return;
        }
        String stringExtra = intent2.getStringExtra("VideoRecorder_ToUser");
        String stringExtra2 = intent2.getStringExtra("VideoRecorder_FileName");
        int intExtra = intent2.getIntExtra("VideoRecorder_VideoLength", 0);
        Log.m105920e("MicroMsg.ChattingUI.VideoComponent", "fileName " + stringExtra2 + " length " + intExtra + " user " + stringExtra);
        if (Util.isNullOrNil(stringExtra) || Util.isNullOrNil(stringExtra2) || intExtra < 0) {
        } else if (!stringExtra.equals("medianote") || (C75592q0.m90787q() & 16384) != 0) {
            C98429r0.m127826q(stringExtra2, (String) null, intExtra, stringExtra, (String) null, 0, "", 43, (tc4) null, "", 0, (String) null, (String) null);
            ((C101491u) C86312j.m106911c(C101491u.class)).mo140800Ic(stringExtra2);
            this.f215752d.mo91541B(true);
        } else {
            C98408n0 n0Var = new C98408n0();
            n0Var.f288554a = stringExtra2;
            n0Var.f288566m = intExtra;
            n0Var.f288570q = stringExtra;
            n0Var.f288571r = (String) C86709a0.m107535s().mo121142i().mo119684e(2, "");
            n0Var.f288563j = Util.nowSecond();
            n0Var.f288564k = Util.nowSecond();
            n0Var.f288558e = intExtra;
            n0Var.f288557d = intExtra;
            int m = C98410o0.m127731m(C98398h0.Bx0().mo137728q(stringExtra2));
            if (m <= 0) {
                Log.m105920e("MicroMsg.VideoLogic", "get Video size failed :" + stringExtra2);
                return;
            }
            n0Var.f288559f = m;
            String r = C98398h0.Bx0().mo137729r(stringExtra2);
            int m2 = C98410o0.m127731m(r);
            if (m2 <= 0) {
                Log.m105920e("MicroMsg.VideoLogic", "get Thumb size failed :" + r + " size:" + m2);
                return;
            }
            n0Var.f288561h = m2;
            Log.m105918d("MicroMsg.VideoLogic", "init record file:" + stringExtra2 + " thumbsize:" + n0Var.f288561h + " videosize:" + n0Var.f288559f);
            n0Var.f288562i = WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE;
            C72963f4 f4Var = new C72963f4();
            f4Var.mo108749c3(n0Var.mo137707k());
            f4Var.setType(43);
            f4Var.mo108740T2(1);
            f4Var.mo108739S2(stringExtra2);
            f4Var.mo100991d(2);
            f4Var.mo108733M2(C75604z3.m90843o(n0Var.mo137707k()));
            n0Var.f288567n = (long) ((int) C75604z3.m90852x(f4Var));
            C98398h0.Bx0().mo137730s(n0Var);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0044 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo102710l0(com.tencent.p014mm.storage.C72963f4 r4, boolean r5) {
        /*
            r3 = this;
            java.lang.Class<rz.s> r0 = p682rz.C101488s.class
            boolean r1 = r4.mo100994f4()
            r2 = 0
            if (r1 == 0) goto L_0x0024
            di3.d r0 = di3.C86312j.m106911c(r0)
            rz.s r0 = (p682rz.C101488s) r0
            rz.t r0 = r0.Kj0()
            java.lang.String r4 = r4.mo108765s2()
            hd0.o0 r0 = (hd0.C98410o0) r0
            java.lang.String r4 = r0.mo137728q(r4)
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r4 != 0) goto L_0x0045
            goto L_0x0044
        L_0x0024:
            boolean r1 = r4.mo100989b4()
            if (r1 == 0) goto L_0x0045
            di3.d r0 = di3.C86312j.m106911c(r0)
            rz.s r0 = (p682rz.C101488s) r0
            rz.t r0 = r0.Kj0()
            java.lang.String r4 = r4.mo108765s2()
            hd0.o0 r0 = (hd0.C98410o0) r0
            java.lang.String r4 = r0.mo137728q(r4)
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r4 != 0) goto L_0x0045
        L_0x0044:
            r5 = 0
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73669z5.mo102710l0(com.tencent.mm.storage.f4, boolean):boolean");
    }

    /* renamed from: o2 */
    public void mo102711o2(Intent intent, String str) {
        Log.m105918d("MicroMsg.ChattingUI.VideoComponent", "sendVideo");
        if (!C114786m0.m161568a(this.f215752d.mo91565f())) {
            C76879j.m92743n(this.f215752d.mo91565f(), C0966R.string.kaa, C0966R.string.a3h, new z5$$d(this, intent, str), (DialogInterface.OnClickListener) null);
        } else {
            mo102706Y5(intent, str);
        }
    }

    /* renamed from: u */
    public boolean mo102712u(MenuItem menuItem, C72963f4 f4Var) {
        int i;
        int i2;
        C72963f4 f4Var2 = f4Var;
        int itemId = menuItem.getItemId();
        if (itemId == 106) {
            C72963f4 f4Var3 = f4Var2;
            Class cls = C101488s.class;
            C98408n0 f = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137720f(f4Var.mo108765s2());
            if (f == null) {
                Log.m105920e("MicroMsg.ChattingUI.VideoComponent", "save video but videoInfo is null!");
                return true;
            } else if (f.f288562i == 199) {
                String q = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137728q(f4Var.mo108765s2());
                int p1 = C72996z1.m85820U5(f.mo137707k()) ? ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(f.mo137707k()) : 0;
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(106, 215, 1, false);
                nVar.mo160131h(12084, Integer.valueOf(f.f288559f), Integer.valueOf(f.f288566m * 1000), 0, 2, f.mo137707k(), Integer.valueOf(p1), C98408n0.m127710c(f.mo137705i()), Long.valueOf(f.f288563j));
                String str = f.f288546N;
                C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(str);
                if (Zd != null && Zd.f288562i == 199) {
                    q = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137728q(str);
                }
                ((C98250h) C86312j.m106911c(C98250h.class)).mo137342Lm(this.f215752d.mo91565f(), q, new C73437b6(this));
                return true;
            } else {
                C86709a0.m107525e().postToWorker(new C73418a6(this, f.mo137700d(), 6));
                Log.m105924i("MicroMsg.ChattingUI.VideoComponent", "[ImageGalleryUI] enter");
                Intent intent = new Intent(this.f215752d.mo91565f(), ImageGalleryUI.class);
                intent.putExtra("img_gallery_msg_id", f4Var.getMsgId());
                intent.putExtra("img_gallery_msg_svr_id", f4Var.mo108774y2());
                intent.putExtra("img_gallery_talker", f4Var.mo108768t());
                intent.putExtra("img_gallery_chatroom_name", f4Var.mo108768t());
                intent.putExtra("img_gallery_enter_video_opcode", C98429r0.m127814e(f4Var.getMsgId(), 2));
                C73521l0.m86924a(this.f215752d, f4Var3, intent);
                BaseChattingUIFragment baseChattingUIFragment = this.f215752d.f193286j;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(baseChattingUIFragment, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickSaveVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                baseChattingUIFragment.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(baseChattingUIFragment, "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickSaveVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                this.f215752d.f193286j.overridePendingTransition(0, 0);
                return true;
            }
        } else if (itemId == 107) {
            C72963f4 f4Var4 = f4Var2;
            C6789c.m7088a(f4Var4, this.f215752d.mo91565f(), new z5$$a(this, f4Var4));
            if (!C75569c4.m90663I(f4Var)) {
                return false;
            }
            SpamMediaToEmojiOPStruct spamMediaToEmojiOPStruct = new SpamMediaToEmojiOPStruct();
            spamMediaToEmojiOPStruct.f194459d = f4Var.mo108774y2();
            spamMediaToEmojiOPStruct.f194460e = (long) f4Var.getType();
            spamMediaToEmojiOPStruct.f194461f = (long) C75569c4.m90678k(f4Var);
            spamMediaToEmojiOPStruct.f194462g = 4;
            spamMediaToEmojiOPStruct.mo86054n();
            return false;
        } else if (itemId != 130) {
            return false;
        } else {
            Intent intent2 = menuItem.getIntent();
            int[] iArr = new int[2];
            if (intent2 == null) {
                Log.m105920e("MicroMsg.ChattingUI.VideoComponent", "[LONGCLICK_MENU_MUTE_PLAY] intent is null!");
                i2 = 0;
                i = 0;
            } else {
                int intExtra = intent2.getIntExtra("img_gallery_width", 0);
                int intExtra2 = intent2.getIntExtra("img_gallery_height", 0);
                iArr[0] = intent2.getIntExtra("img_gallery_left", 0);
                iArr[1] = intent2.getIntExtra("img_gallery_top", 0);
                i2 = intExtra;
                i = intExtra2;
            }
            Log.m105924i("MicroMsg.ChattingUI.VideoComponent", "[ImageGalleryUI] LONGCLICK_MENU_MUTE_PLAY");
            Intent intent3 = new Intent(this.f215752d.mo91565f(), ImageGalleryUI.class);
            intent3.putExtra("img_gallery_msg_id", f4Var.getMsgId());
            intent3.putExtra("img_gallery_msg_svr_id", f4Var.mo108774y2());
            intent3.putExtra("img_gallery_talker", f4Var.mo108768t());
            intent3.putExtra("img_gallery_chatroom_name", f4Var.mo108768t());
            intent3.putExtra("img_gallery_left", iArr[0]);
            intent3.putExtra("img_gallery_top", iArr[1]);
            intent3.putExtra("img_gallery_width", i2);
            intent3.putExtra("img_gallery_height", i);
            intent3.putExtra("img_gallery_enter_video_opcode", C98429r0.m127814e(f4Var.getMsgId(), 3));
            C73521l0.m86924a(this.f215752d, f4Var, intent3);
            BaseChattingUIFragment baseChattingUIFragment2 = this.f215752d.f193286j;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent3);
            BaseChattingUIFragment baseChattingUIFragment3 = baseChattingUIFragment2;
            C117292a.m165358d(baseChattingUIFragment3, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/component/VideoComponent", "dealWithLongClick", "(Landroid/view/MenuItem;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            baseChattingUIFragment2.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(baseChattingUIFragment3, "com/tencent/mm/ui/chatting/component/VideoComponent", "dealWithLongClick", "(Landroid/view/MenuItem;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.f215752d.f193286j.overridePendingTransition(0, 0);
            return true;
        }
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        Map<String, Integer> map = SightPlayController.f273459I;
        ((C101485o) C86312j.m106911c(C101485o.class)).mo140808fO(new C30396b(), 0);
        this.f216300e.clear();
    }
}
