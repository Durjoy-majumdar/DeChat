package ik3;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.multitask.C56887p;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d92.C107028a;
import f40.C86709a0;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import k92.C108976d;
import te3.C101828pe0;

/* renamed from: ik3.c */
public class C98700c extends C108976d implements C21105d {

    /* renamed from: x */
    public static final Set<String> f289434x;

    /* renamed from: y */
    public static boolean f289435y = false;

    /* renamed from: z */
    public static long f289436z = 0;

    /* renamed from: u */
    public C101828pe0 f289437u = new C101828pe0();

    /* renamed from: v */
    public boolean f289438v = false;

    /* renamed from: w */
    public boolean f289439w = false;

    static {
        HashSet hashSet = new HashSet();
        f289434x = hashSet;
        hashSet.add("app_type");
        hashSet.add("app_media_id");
        hashSet.add("app_msg_id");
        hashSet.add("app_show_share");
        hashSet.add(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
    }

    public C98700c(C107028a aVar) {
        super(aVar);
    }

    /* renamed from: Z */
    public static boolean m128469Z() {
        long currentTimeMillis = System.currentTimeMillis();
        f289436z = currentTimeMillis;
        if (f289436z + 30000 < currentTimeMillis) {
            C86709a0.m107528h();
            f289435y = C86709a0.m107535s().mo121147n();
        }
        return f289435y;
    }

    /* renamed from: A */
    public boolean mo67893A() {
        return true;
    }

    /* renamed from: C */
    public boolean mo35808C() {
        return (Util.isNullOrNil(this.f289437u.f299161e) || C86013q1.m106450k(this.f289437u.f299161e)) && !this.f289439w;
    }

    /* renamed from: U */
    public boolean mo67896U(int i, boolean z) {
        return super.mo67896U(i, this.f289438v);
    }

    /* renamed from: k */
    public void mo32877k(long j) {
        C101828pe0 pe02 = this.f289437u;
        if (pe02 != null) {
            pe02.f299167n = j;
            try {
                this.f326418a.field_data = pe02.toByteArray();
            } catch (IOException e) {
                Log.m105921e("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "updateFileLen", e);
            }
        }
    }

    /* renamed from: l */
    public void mo32878l(String str, String str2, int i, boolean z) {
        Bundle extras;
        Log.m105925i("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "onCreate, filePath:%s fileExt:%s sence:%s", str, str2, Integer.valueOf(i));
        mo35809D(4, C56887p.m65609c(str));
        this.f289438v = false;
        C101828pe0 pe02 = this.f289437u;
        pe02.f299161e = str;
        pe02.f299167n = C86013q1.m106451l(str);
        if (!z) {
            C101828pe0 pe03 = this.f289437u;
            pe03.f299162f = str2;
            pe03.f299165i = i;
            pe03.f299160d = false;
            try {
                this.f326418a.field_data = pe03.toByteArray();
            } catch (IOException e) {
                Log.m105921e("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "handleMultiTaskInfoClicked", e);
            }
            mo160075M();
        } else if (this.f326423e.getIntent() != null) {
            Intent intent = this.f326423e.getIntent();
            C101828pe0 pe04 = this.f289437u;
            if (!(pe04 == null || (extras = intent.getExtras()) == null)) {
                pe04.f299168o = extras.getString("app_type");
                pe04.f299169p = extras.getString("app_media_id");
                pe04.f299170q = extras.getLong("app_msg_id");
                pe04.f299171r = extras.getBoolean("app_show_share");
                pe04.f299172s = extras.getInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            }
            C101828pe0 pe05 = this.f289437u;
            pe05.f299160d = true;
            try {
                this.f326418a.field_data = pe05.toByteArray();
            } catch (IOException e2) {
                Log.m105921e("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "handleMultiTaskInfoClicked", e2);
            }
            mo160075M();
        }
    }

    /* renamed from: q */
    public void mo32879q(String str, String str2) {
        MultiTaskInfo multiTaskInfo = this.f326418a;
        multiTaskInfo.mo80305m2().f183752e = str2;
        multiTaskInfo.mo80305m2().f183755h = str;
        mo160075M();
    }

    /* renamed from: t */
    public long mo138110t() {
        return 1000;
    }

    /* renamed from: x */
    public boolean mo138111x() {
        return !this.f289439w;
    }
}
