package com.tencent.p014mm.plugin.fav.p047ui.detail;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelstat.C81030i;
import com.tencent.p014mm.p136ui.widget.MMLoadScrollView;
import com.tencent.p014mm.plugin.fav.p047ui.C93693r;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavDetailScrollView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import di3.C86312j;
import java.util.Map;
import kj2.C117407d;
import o90.C100301b;
import p823sg.C101611g;
import pb1.C100695a0;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import q90.C101062d;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI */
public abstract class BaseFavDetailReportUI extends BaseFavSearchReportUI {

    /* renamed from: g */
    public C100695a0.C100696a f270015g = new C100695a0.C100696a();

    /* renamed from: h */
    public boolean f270016h;

    /* renamed from: i */
    public String f270017i = null;

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI$a */
    public class C93498a implements MMLoadScrollView.C97273a {
        public C93498a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI$b */
    public class C93499b implements FavDetailScrollView.C93715a {
        public C93499b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI$c */
    public class C93500c implements Runnable {
        public C93500c() {
        }

        public void run() {
            BaseFavDetailReportUI.this.f270015g.f295035t = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142267bD((int) BaseFavDetailReportUI.this.f270015g.f295018c) + 1;
            C100695a0.C100696a aVar = BaseFavDetailReportUI.this.f270015g;
            Map<Long, Long> map = C100695a0.f295014a;
            String aVar2 = aVar.toString();
            Log.m105927v("MicroMsg.Fav.FavReportApiLogic", "reportDetailObj %s", aVar2);
            C117407d.INSTANCE.kvStat(15098, aVar2);
            String.format("scene[%s],index[%s],favId[%s],type[%s],infoLength[%s],source[%s],timestamp[%s],detailPeriod[%s],subDetailPeriod[%s],needOpenOtherApp[%s],subDetailCount[%s],shareFriendCount[%s],shareSnsCount[%s],editContentCount[%s],editTagCount[%s],isDelete[%s],isScrollBottom[%s],subScene[%s]", new Object[]{Integer.valueOf(aVar.f295016a), Integer.valueOf(aVar.f295017b), Long.valueOf(aVar.f295018c), Integer.valueOf(aVar.f295019d), aVar.f295020e, Integer.valueOf(aVar.f295021f), Long.valueOf(aVar.f295022g), Long.valueOf(aVar.f295023h), Long.valueOf(aVar.f295024i), Integer.valueOf(aVar.f295025j ? 1 : 0), Integer.valueOf(aVar.f295026k), Integer.valueOf(aVar.f295027l), Integer.valueOf(aVar.f295028m), Integer.valueOf(aVar.f295029n), Integer.valueOf(aVar.f295030o), Integer.valueOf(aVar.f295031p ? 1 : 0), Integer.valueOf(aVar.f295032q ? 1 : 0), Integer.valueOf(aVar.f295033r)});
        }
    }

    /* renamed from: I7 */
    public MMLoadScrollView mo128398I7() {
        return null;
    }

    /* renamed from: J7 */
    public void mo128399J7(C100755z zVar) {
        if (zVar != null) {
            C100695a0.C100696a aVar = this.f270015g;
            if (aVar.f295016a > 0) {
                aVar.f295018c = (long) zVar.field_id;
                aVar.f295019d = zVar.field_type;
                aVar.f295021f = zVar.field_sourceType;
                long j = zVar.field_sourceCreateTime / 1000;
                aVar.f295022g = j;
                if (j == 0) {
                    aVar.f295022g = zVar.field_updateTime / 1000;
                }
                if (aVar.f295022g == 0) {
                    aVar.f295022g = zVar.field_edittime;
                }
                aVar.f295020e = C100734q.m131816G(zVar);
                this.f270016h = true;
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && intent != null) {
            long longExtra = intent.getLongExtra("key_activity_browse_time", 0);
            C100695a0.C100696a aVar = this.f270015g;
            long j = aVar.f295024i + longExtra;
            aVar.f295024i = j;
            Log.m105927v("MicroMsg.Fav.BaseFavDetailReportUI", "onActivityResult subDetailPeriod[%d] subUIBrowserTime[%d]", Long.valueOf(j), Long.valueOf(longExtra));
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f270015g.f295016a = getIntent().getIntExtra("key_detail_fav_scene", 0);
        this.f270015g.f295033r = getIntent().getIntExtra("key_detail_fav_sub_scene", 0);
        this.f270015g.f295017b = getIntent().getIntExtra("key_detail_fav_index", 0);
        this.f270015g.f295036u = getIntent().getStringExtra("key_detail_fav_query");
        this.f270015g.f295034s = getIntent().getStringExtra("key_detail_fav_sessionid");
        this.f270015g.f295037v = getIntent().getStringExtra("key_detail_fav_tags");
        C100695a0.C100696a aVar = this.f270015g;
        String str = aVar.f295036u;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        aVar.f295036u = str;
        String str3 = aVar.f295034s;
        if (str3 == null) {
            str3 = str2;
        }
        aVar.f295034s = str3;
        String str4 = aVar.f295037v;
        if (str4 != null) {
            str2 = str4;
        }
        aVar.f295037v = str2;
        MMLoadScrollView I7 = mo128398I7();
        if (I7 != null) {
            I7.setOnTopOrBottomListerner(new C93498a());
            if (I7 instanceof FavDetailScrollView) {
                ((FavDetailScrollView) I7).setOnScrollChangeListener(new C93499b());
            }
        }
        if (this.f270015g.f295016a == 0) {
            Log.m105924i("MicroMsg.Fav.BaseFavDetailReportUI", "report object scene is 0");
        }
        setActionbarColor(getContext().getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
    }

    public void onDestroy() {
        if (this.f270016h) {
            ThreadPool.post(new C93500c(), "BaseFavReport");
        }
        setResult(-1, getIntent().putExtra("key_activity_browse_time", getActivityBrowseTimeMs()));
        C101611g<String, Bitmap> gVar = C93693r.f270490a;
        C93693r.f270490a = new C100301b(20, C93693r.class);
        super.onDestroy();
    }

    public void onPause() {
        this.f270015g.f295023h = getActivityBrowseTimeMs();
        String str = C81030i.m98944a().f238011b;
        if (!Util.isEqual(getClass().getName(), str) && !Util.isEqual(str, this.f270017i)) {
            C100695a0.C100696a aVar = this.f270015g;
            long j = aVar.f295024i;
            C81030i a = C81030i.m98944a();
            String str2 = C81030i.m98944a().f238011b;
            C101611g<String, Long> gVar = a.f238010a;
            aVar.f295024i = j + (gVar != null ? ((Long) ((C101062d) gVar).get(str2)).longValue() : 0);
        }
        Log.m105927v("MicroMsg.Fav.BaseFavDetailReportUI", "onPause lastClassname[%s] detailPeriod[%d] subDetailPeriod[%d]", str, Long.valueOf(this.f270015g.f295023h), Long.valueOf(this.f270015g.f295024i));
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (Util.isNullOrNil(this.f270017i)) {
            this.f270017i = C81030i.m98944a().f238011b;
        }
        Log.m105927v("MicroMsg.Fav.BaseFavDetailReportUI", "onResume firstResumeClassname[%s]", this.f270017i);
    }
}
