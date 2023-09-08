package hd0;

import android.net.Uri;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.modelvideoh265toh264.C92862f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C96794v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C30731d4;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.FileSystem;
import di3.C86312j;
import h81.C32735h;
import java.io.File;
import p509eu.C97708g;
import te3.C101783gu2;

/* renamed from: hd0.j0 */
public class C98402j0 implements C32815d0 {

    /* renamed from: d */
    public VideoTransPara f288504d = null;

    /* renamed from: e */
    public VideoTransPara f288505e = null;

    /* renamed from: f */
    public String f288506f;

    /* renamed from: g */
    public String f288507g;

    /* renamed from: h */
    public Boolean f288508h = Boolean.FALSE;

    /* renamed from: N4 */
    public void mo58819N4(String str) {
        boolean z;
        String str2 = str;
        C98408n0 f = C98398h0.Bx0().mo137720f(str2);
        this.f288506f = C98398h0.Bx0().mo137728q(str2);
        this.f288507g = C98398h0.Bx0().mo137728q(str2) + ".tmp";
        Log.m105925i("MicroMsg.TransferVideoMsgSendCallback", "srcPath： %s", this.f288506f);
        Log.m105925i("MicroMsg.TransferVideoMsgSendCallback", "dstPath：%s", this.f288507g);
        this.f288508h = Boolean.valueOf(C92862f.m117175h(this.f288506f));
        boolean z2 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_c2c_enable_upload_hevc, 0) == 0;
        if (WeChatEnvironment.hasDebugger()) {
            z2 = false;
        }
        Log.m105925i("MicroMsg.TransferVideoMsgSendCallback", "needConvert hevc:%s", Boolean.valueOf(z2));
        String i = C86013q1.m106448i(this.f288506f, false);
        Log.m105924i("MicroMsg.TransferVideoMsgSendCallback", "before transfer, export path = " + i);
        if (!z2 || !C86013q1.m106450k(this.f288506f) || !this.f288508h.booleanValue()) {
            Log.m105924i("MicroMsg.TransferVideoMsgSendCallback", "video format is h264，do not need to tranfer");
            if (f != null && !Util.isNullOrNil(f.mo137702f()) && C86013q1.m106450k(f.mo137702f())) {
                C101783gu2 gu22 = f.f288538F;
                if (gu22 == null || !gu22.f298309e) {
                    String f2 = f.mo137702f();
                    Uri n = C116299g2.m163858n(f2);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    String q = C98398h0.Bx0().mo137728q(str2);
                    VideoTransPara a = C92862f.m117168a(f2);
                    this.f288505e = a;
                    this.f288504d = C92862f.m117169b(a, f2);
                    if (!(C86013q1.m106450k(q) || this.f288505e == null || this.f288504d == null)) {
                        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                        if (!l.mo177810a()) {
                            z = false;
                        } else {
                            FileSystem.C85995c cVar = l.f348991a;
                            String w = cVar.mo119947w(l.f348992b, false);
                            z = w != null ? new File(w).canRead() : cVar.mo119948x(l.f348992b);
                        }
                        if (z) {
                            Util.currentTicks();
                            this.f288508h = Boolean.valueOf(C92862f.m117175h(f2));
                            Log.m105925i("MicroMsg.TransferVideoMsgSendCallback", "before video send, local remux file path not exist, do remux here, outsize: %sx%s, localDstFilePath: %s, importPath: %s, isH265: %s", Integer.valueOf(this.f288504d.f267166d), Integer.valueOf(this.f288504d.f267167e), q, f2, this.f288508h);
                            int b = C96794v0.m124290b(f2, q, this.f288504d, true);
                            Log.m105925i("MicroMsg.TransferVideoMsgSendCallback", "remux ret:%d, isH265:%s", Integer.valueOf(b), this.f288508h);
                            if (!this.f288508h.booleanValue() && b > 0) {
                                ((C30731d4) ((C97708g) C86312j.m106911c(C97708g.class)).mo58053A1()).mo57630e(f2, q, b);
                            }
                            int i2 = this.f288505e.f267170h;
                            if (i2 > 0) {
                                f.f288566m = i2;
                                C98398h0.Bx0().mo137733w(f);
                                return;
                            }
                            return;
                        }
                    }
                    Log.m105924i("MicroMsg.TransferVideoMsgSendCallback", "before video send, is a local capture video, do nothing");
                    return;
                }
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.TransferVideoMsgSendCallback", "before video send, is h265");
        long currentTicks = Util.currentTicks();
        if (!C86013q1.m106450k(this.f288506f)) {
            Log.m105920e("MicroMsg.TransferVideoMsgSendCallback", "before video send, is h265 file not exist!");
            return;
        }
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(354, 249, 1, false);
        VideoTransPara a2 = C92862f.m117168a(i);
        this.f288505e = a2;
        VideoTransPara b2 = C92862f.m117169b(a2, i);
        this.f288504d = b2;
        if (this.f288505e != null && b2 != null && i != null) {
            if (C96794v0.m124290b(i, this.f288507g, b2, true) < 0) {
                nVar.idkeyStat(354, 250, 1, false);
            }
            C86013q1.m106463x(this.f288507g, this.f288506f);
            C86013q1.m106447h(this.f288507g);
            C98408n0 i3 = C98429r0.m127818i(str);
            if (i3 != null) {
                i3.f288540H = 1;
                i3.f288548P = 2;
                C98398h0.Bx0().mo137733w(i3);
            }
            Log.m105925i("MicroMsg.TransferVideoMsgSendCallback", "transfer to h264 finish, used %sms", Long.valueOf(Util.ticksToNow(currentTicks)));
        }
    }
}
