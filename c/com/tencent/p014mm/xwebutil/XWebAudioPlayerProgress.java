package com.tencent.p014mm.xwebutil;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.xwebutil.XWebAudioPlayerProgressBall;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.xweb.file.XVFSFile;
import lu3.C34379c;

/* renamed from: com.tencent.mm.xwebutil.XWebAudioPlayerProgress */
public class XWebAudioPlayerProgress extends RelativeLayout implements XWebAudioPlayerProgressBall.C19893a {

    /* renamed from: d */
    public long f56698d = 0;

    /* renamed from: e */
    public long f56699e = 0;

    /* renamed from: f */
    public TextView f56700f = null;

    /* renamed from: g */
    public TextView f56701g = null;

    /* renamed from: h */
    public View f56702h = null;

    /* renamed from: i */
    public XWebAudioPlayerProgressBall f56703i = null;

    /* renamed from: j */
    public C19892e f56704j = null;

    /* renamed from: n */
    public C34379c<?> f56705n = null;

    /* renamed from: o */
    public Runnable f56706o = new C19889b();

    /* renamed from: com.tencent.mm.xwebutil.XWebAudioPlayerProgress$a */
    public class C19888a implements Runnable {
        public C19888a() {
        }

        public void run() {
            XWebAudioPlayerProgress xWebAudioPlayerProgress = XWebAudioPlayerProgress.this;
            xWebAudioPlayerProgress.f56703i.setTotalLength(xWebAudioPlayerProgress.f56702h.getWidth());
        }
    }

    /* renamed from: com.tencent.mm.xwebutil.XWebAudioPlayerProgress$b */
    public class C19889b implements Runnable {
        public C19889b() {
        }

        public void run() {
            C19892e eVar = XWebAudioPlayerProgress.this.f56704j;
            if (eVar != null) {
                C19902g gVar = (C19902g) eVar;
                gVar.getClass();
                long j = 0;
                try {
                    if (!C19905j.m21650b(gVar.f56731a)) {
                        Log.m105918d("XFilesAudioPlayerLogic", "progressBar getCurrentTime, sCurrentParams invalid");
                    } else {
                        ITPPlayer iTPPlayer = C19905j.f56734a.f56748h;
                        if (iTPPlayer == null) {
                            Log.m105918d("XFilesAudioPlayerLogic", "progressBar getCurrentTime, tpPlayer invalid");
                        } else {
                            int currentState = iTPPlayer.getCurrentState();
                            if (!(currentState == 7 || currentState == 8)) {
                                if (currentState != 9) {
                                    j = iTPPlayer.getCurrentPositionMs();
                                }
                            }
                            j = iTPPlayer.getDurationMs();
                        }
                    }
                } catch (Throwable th) {
                    Log.m105918d("XFilesAudioPlayerLogic", "progressBar getCurrentTime error: " + th.getMessage());
                }
                XWebAudioPlayerProgress xWebAudioPlayerProgress = XWebAudioPlayerProgress.this;
                if (xWebAudioPlayerProgress.f56703i.mo26658a(((float) j) / ((float) xWebAudioPlayerProgress.f56699e), false)) {
                    XWebAudioPlayerProgress xWebAudioPlayerProgress2 = XWebAudioPlayerProgress.this;
                    xWebAudioPlayerProgress2.f56698d = j;
                    xWebAudioPlayerProgress2.f56700f.setText(xWebAudioPlayerProgress2.mo26648a(j));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.xwebutil.XWebAudioPlayerProgress$c */
    public class C19890c implements Runnable {
        public C19890c() {
        }

        public void run() {
            XWebAudioPlayerProgress xWebAudioPlayerProgress = XWebAudioPlayerProgress.this;
            xWebAudioPlayerProgress.f56703i.setTotalLength(xWebAudioPlayerProgress.f56702h.getWidth());
        }
    }

    /* renamed from: com.tencent.mm.xwebutil.XWebAudioPlayerProgress$d */
    public class C19891d implements Runnable {
        public C19891d() {
        }

        public void run() {
            XWebAudioPlayerProgress xWebAudioPlayerProgress = XWebAudioPlayerProgress.this;
            xWebAudioPlayerProgress.f56703i.setTotalLength(xWebAudioPlayerProgress.f56702h.getWidth());
        }
    }

    /* renamed from: com.tencent.mm.xwebutil.XWebAudioPlayerProgress$e */
    public interface C19892e {
    }

    public XWebAudioPlayerProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo26649b(context);
    }

    /* renamed from: a */
    public String mo26648a(long j) {
        boolean z;
        if (j < 0) {
            j = 0;
        }
        long j2 = j / 1000;
        long j3 = j2 % 60;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 / 3600;
        StringBuilder sb = new StringBuilder();
        if (j5 > 0) {
            z = true;
            sb.append(j5);
            sb.append(XVFSFile.PATH_SEPARATOR);
        } else {
            z = false;
        }
        if (z && j4 < 10) {
            sb.append(0);
        }
        sb.append(j4);
        sb.append(XVFSFile.PATH_SEPARATOR);
        if (j3 < 10) {
            sb.append("0");
        }
        sb.append(j3);
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo26649b(Context context) {
        LayoutInflater.from(context).inflate(C0966R.C0971layout.crm, this);
        this.f56700f = (TextView) findViewById(C0966R.C0970id.mna);
        this.f56701g = (TextView) findViewById(C0966R.C0970id.mnb);
        this.f56702h = findViewById(C0966R.C0970id.mn9);
        XWebAudioPlayerProgressBall xWebAudioPlayerProgressBall = (XWebAudioPlayerProgressBall) findViewById(C0966R.C0970id.mn_);
        this.f56703i = xWebAudioPlayerProgressBall;
        xWebAudioPlayerProgressBall.setOperationCallback(this);
        this.f56700f.setText(mo26648a(this.f56698d));
        this.f56701g.setText(mo26648a(this.f56699e));
        this.f56702h.post(new C19888a());
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f56702h.post(new C19890c());
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f56703i.getTotalLength() == 0) {
            this.f56702h.post(new C19891d());
        }
    }

    public void setProgressCallback(C19892e eVar) {
        this.f56704j = eVar;
    }

    public void setTotalTime(long j) {
        if (j < 0) {
            Log.m105920e("XFilesAudioPlayerProgress", "setTotalTime invalid totalTime = " + j);
            this.f56699e = 0;
        } else {
            Log.m105924i("XFilesAudioPlayerProgress", "setTotalTime totalTime = " + j);
            this.f56699e = j;
        }
        this.f56701g.setText(mo26648a(this.f56699e));
    }

    public XWebAudioPlayerProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo26649b(context);
    }
}
