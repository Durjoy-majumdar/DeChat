package com.tencent.p014mm.plugin.setting.p102ui.fixtools;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import bn2.C67295g;
import bn2.C67296h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75576f4;
import f40.C86709a0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import nj3.C88989a;
import xm2.C78860d;
import xm2.C78862e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUpLogUploadingUI */
public class FixToolsUpLogUploadingUI extends MMWizardActivity {

    /* renamed from: n */
    public static final /* synthetic */ int f205594n = 0;

    /* renamed from: e */
    public Button f205595e;

    /* renamed from: f */
    public TextView f205596f;

    /* renamed from: g */
    public ImageView f205597g;

    /* renamed from: h */
    public ProgressBar f205598h;

    /* renamed from: i */
    public TextView f205599i;

    /* renamed from: j */
    public C78862e.C78863a f205600j = new C71036a();

    /* renamed from: com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUpLogUploadingUI$a */
    public class C71036a implements C78862e.C78863a {
        public C71036a() {
        }

        /* renamed from: a */
        public void mo97689a(int i, long j, long j2) {
            int i2 = i;
            Log.m105925i("MicroMsg.FixToolsUpLogUploadingUI", "fixToolsUplogProgressCallback percent:%d", Integer.valueOf(i));
            if (i2 < 0) {
                C115669n.INSTANCE.idkeyStat(873, 18, 1, false);
                FixToolsUpLogUploadingUI.this.f205597g.setImageResource(C0966R.raw.fix_tools_failed);
                FixToolsUpLogUploadingUI.this.f205596f.setText(C0966R.string.ev4);
                FixToolsUpLogUploadingUI.this.f205598h.setVisibility(8);
                FixToolsUpLogUploadingUI.this.f205599i.setVisibility(8);
                FixToolsUpLogUploadingUI.this.f205595e.setVisibility(0);
            } else if (i2 >= 100) {
                C115669n.INSTANCE.idkeyStat(873, 17, 1, false);
                FixToolsUpLogUploadingUI.this.f205597g.setImageResource(C0966R.raw.fix_tools_finish);
                FixToolsUpLogUploadingUI.this.f205596f.setText(C0966R.string.ev5);
                FixToolsUpLogUploadingUI.this.f205598h.setVisibility(8);
                FixToolsUpLogUploadingUI.this.f205599i.setVisibility(8);
                FixToolsUpLogUploadingUI.this.f205595e.setVisibility(0);
            } else {
                FixToolsUpLogUploadingUI.this.f205598h.setProgress(i);
                FixToolsUpLogUploadingUI fixToolsUpLogUploadingUI = FixToolsUpLogUploadingUI.this;
                fixToolsUpLogUploadingUI.f205599i.setText(String.format("%s / %s", new Object[]{fixToolsUpLogUploadingUI.mo97688N7(j2), fixToolsUpLogUploadingUI.mo97688N7(j)}));
            }
        }
    }

    /* renamed from: N7 */
    public final String mo97688N7(long j) {
        if (j < 0) {
            return "-";
        }
        if (j < 1024) {
            return String.format("%s B", new Object[]{Long.valueOf(j)});
        } else if (j < 1048576) {
            return String.format("%.1f KB", new Object[]{Float.valueOf(((float) j) / 1024.0f)});
        } else if (j < 1073741824) {
            return String.format("%.1f MB", new Object[]{Float.valueOf(((float) j) / 1048576.0f)});
        } else {
            return String.format("%.1f GB", new Object[]{Float.valueOf(((float) j) / 1.07374182E9f)});
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aro;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().getExtras().getBoolean("MMWizardActivity.WIZARD_ROOT_KILLSELF", false)) {
            setMMTitle((int) C0966R.string.f360803ev2);
            this.f205596f = (TextView) findViewById(C0966R.C0970id.e_i);
            this.f205597g = (ImageView) findViewById(C0966R.C0970id.e_f);
            this.f205595e = (Button) findViewById(C0966R.C0970id.e_e);
            this.f205598h = (ProgressBar) findViewById(C0966R.C0970id.e_g);
            this.f205599i = (TextView) findViewById(C0966R.C0970id.a3o);
            this.f205597g.setImageResource(C0966R.raw.fix_tools_uplog);
            this.f205596f.setText(C0966R.string.ev8);
            this.f205595e.setOnClickListener(new C67295g(this));
            setBackBtn(new C67296h(this));
            this.f205598h.setVisibility(0);
            this.f205599i.setVisibility(0);
            this.f205595e.setVisibility(8);
            String stringExtra = getIntent().getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_DATE);
            String stringExtra2 = getIntent().getStringExtra("begin_hour");
            String stringExtra3 = getIntent().getStringExtra("end_hour");
            if (C78862e.f231707c == null) {
                C78862e.f231707c = new C78862e();
            }
            C78862e eVar = C78862e.f231707c;
            C78862e.C78863a aVar = this.f205600j;
            eVar.getClass();
            C78862e.f231706b = aVar;
            Log.m105925i("MicroMsg.FixToolsUplogModel", "startUplog, date:%s, isUploading:%b, beginHour: %s, endHour: %s", stringExtra, Boolean.valueOf(eVar.f231708a), stringExtra2, stringExtra3);
            if (!eVar.f231708a) {
                eVar.f231708a = true;
                int g = C86709a0.m107522a() ? C86709a0.m107523b().mo121110g() : 0;
                long nowMilliSecond = (((Util.nowMilliSecond() / 86400000) * 86400000) + 57600000) - 1;
                StringBuffer stringBuffer = new StringBuffer(stringExtra);
                stringBuffer.append("000000");
                String stringBuffer2 = stringBuffer.toString();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                long nowMilliSecond2 = Util.nowMilliSecond();
                try {
                    nowMilliSecond2 = simpleDateFormat.parse(stringBuffer2).getTime();
                } catch (ParseException unused) {
                    Log.m105921e("MicroMsg.FixToolsUplogModel", "dateToTimeStamp failed. date:%s, stack:%s", stringBuffer2, Util.getStack());
                }
                int a = eVar.mo108885a(stringExtra2, 0);
                int a2 = eVar.mo108885a(stringExtra3, 24);
                int i = (int) ((nowMilliSecond - nowMilliSecond2) / 86400000);
                Log.m105925i("MicroMsg.FixToolsUplogModel", "startNewUplog, chooseTime:%d, chooseBeginHour:%s, chooseEndHour:%s, time:%d", Long.valueOf(nowMilliSecond2), Integer.valueOf(a), Integer.valueOf(a2), Integer.valueOf(i));
                C86709a0.m107524d().mo123460f(new C75576f4(new C78860d(eVar, i, g, a, a2), (String) null));
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo7681K7(1);
        return true;
    }
}
