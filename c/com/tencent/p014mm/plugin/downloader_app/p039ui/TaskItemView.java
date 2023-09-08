package com.tencent.p014mm.plugin.downloader_app.p039ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader.model.C40934k;
import com.tencent.p014mm.plugin.downloader_app.model.C40990e0;
import com.tencent.p014mm.plugin.downloader_app.model.C41008v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import d51.C7171c;
import g51.C45880a;
import gc0.C20828a;
import j20.C117292a;
import j51.C46411l;
import j51.C46412m;
import j51.C46413n;
import java.util.HashSet;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import v41.C52759r;
import wq3.C111847h;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.TaskItemView */
public class TaskItemView extends LinearLayout implements C111847h {

    /* renamed from: D */
    public static final /* synthetic */ int f110453D = 0;

    /* renamed from: A */
    public C40990e0 f110454A;

    /* renamed from: B */
    public boolean f110455B = false;

    /* renamed from: C */
    public C41028a f110456C;

    /* renamed from: d */
    public ImageView f110457d;

    /* renamed from: e */
    public AppIconView f110458e;

    /* renamed from: f */
    public TextView f110459f;

    /* renamed from: g */
    public TextView f110460g;

    /* renamed from: h */
    public TextView f110461h;

    /* renamed from: i */
    public FrameLayout f110462i;

    /* renamed from: j */
    public ProgressImageView f110463j;

    /* renamed from: n */
    public FrameLayout f110464n;

    /* renamed from: o */
    public Button f110465o;

    /* renamed from: p */
    public Button f110466p;

    /* renamed from: q */
    public DownloadUpdateDescView f110467q;

    /* renamed from: r */
    public LinearLayout f110468r;

    /* renamed from: s */
    public ImageView f110469s;

    /* renamed from: t */
    public TextView f110470t;

    /* renamed from: u */
    public View f110471u;

    /* renamed from: v */
    public TextView f110472v;

    /* renamed from: w */
    public TextView f110473w;

    /* renamed from: x */
    public TextView f110474x;

    /* renamed from: y */
    public TextView f110475y;

    /* renamed from: z */
    public TextView f110476z;

    /* renamed from: com.tencent.mm.plugin.downloader_app.ui.TaskItemView$a */
    public interface C41028a {
    }

    public TaskItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private long getFileSize() {
        C53736a d = C40933j.m44315d(this.f110454A.f110335f);
        if (d != null) {
            long j = d.field_fileSize;
            if (j > 0) {
                return j;
            }
        }
        return this.f110454A.f110342m.f147351f;
    }

    private void setButtonText(int i) {
        if (i == C0966R.string.frb) {
            this.f110465o.setVisibility(8);
            this.f110466p.setVisibility(0);
        } else {
            this.f110466p.setVisibility(8);
            this.f110465o.setVisibility(0);
            this.f110465o.setText(i);
        }
        this.f110464n.setVisibility(0);
    }

    private void setTaskSize(long j) {
        mo64067a(j, false);
    }

    /* renamed from: a */
    public final void mo64067a(long j, boolean z) {
        long fileSize = getFileSize();
        float f = (float) fileSize;
        float f2 = f / 1.07374182E9f;
        float f3 = f / 1048576.0f;
        if (j < fileSize) {
            this.f110461h.setText(String.format("%.1fMB / %.1fMB", new Object[]{Float.valueOf(((float) j) / 1048576.0f), Float.valueOf(f3)}));
            if (z) {
                this.f110463j.setProgress((int) ((j * 100) / fileSize));
            }
        } else if (f2 >= 1.0f) {
            this.f110461h.setText(String.format("%.1fGB", new Object[]{Float.valueOf(f2)}));
        } else {
            this.f110461h.setText(String.format("%.1fMB", new Object[]{Float.valueOf(f3)}));
        }
    }

    /* renamed from: b */
    public final void mo64068b() {
        int i;
        boolean z = true;
        Log.m105919d("MicroMsg.TaskItemView", "updateDownloadStatus: %s", this.f110454A.f110335f);
        this.f110464n.setVisibility(8);
        C53736a d = C40933j.m44315d(this.f110454A.f110335f);
        if (d == null || (i = d.field_status) == 5) {
            setTaskSize(getFileSize());
            this.f110462i.setVisibility(8);
            setButtonText(C0966R.string.c0e);
            return;
        }
        if (i == 3) {
            this.f110462i.setVisibility(8);
            setButtonText(C0966R.string.frb);
        } else if (i == 6) {
            this.f110462i.setVisibility(8);
            long j = d.field_downloadId;
            if (((HashSet) C40934k.f110154a).contains(Long.valueOf(j))) {
                setButtonText(C0966R.string.gqe);
            } else {
                setButtonText(C0966R.string.frb);
            }
        } else {
            this.f110462i.setVisibility(0);
            if (this.f110455B) {
                ProgressImageView progressImageView = this.f110463j;
                progressImageView.f158315h = true;
                progressImageView.f158316i = false;
                if (C85875k4.m106211z()) {
                    progressImageView.setImageResource((int) C0966R.C0969drawable.an_);
                } else {
                    progressImageView.setImageResource((int) C0966R.C0969drawable.ana);
                }
            } else {
                if (d.field_status == 1) {
                    this.f110455B = false;
                    this.f110463j.setProgressColor(C0966R.color.f2939n);
                    this.f110463j.setImageResource((int) C0966R.raw.downloading);
                } else if (d.field_reserveInWifi && !NetStatusUtil.isWifi(getContext())) {
                    this.f110462i.setVisibility(0);
                    this.f110463j.setProgressColor(C0966R.color.FG_1);
                    ProgressImageView progressImageView2 = this.f110463j;
                    progressImageView2.f158316i = true;
                    progressImageView2.f158315h = false;
                    progressImageView2.setImageResource("download_wait_wifi");
                } else if (d.field_status == 4) {
                    this.f110462i.setVisibility(8);
                    setButtonText(C0966R.string.c1l);
                } else {
                    this.f110463j.setProgressColor(C0966R.color.FG_1);
                    this.f110463j.setImageResource("download_app_pause");
                }
                mo64067a(d.field_downloadedSize, z);
            }
        }
        z = false;
        mo64067a(d.field_downloadedSize, z);
    }

    public int getIconPaddingLeft() {
        return this.f110457d.getVisibility() == 0 ? (getResources().getDimensionPixelSize(C0966R.dimen.f3766df) * 2) + getResources().getDimensionPixelSize(C0966R.dimen.avo) : getResources().getDimensionPixelSize(C0966R.dimen.f3766df) * 2;
    }

    public int getNamePaddingLeft() {
        return this.f110457d.getVisibility() == 0 ? getResources().getDimensionPixelSize(C0966R.dimen.f4290yw) : getResources().getDimensionPixelSize(C0966R.dimen.f4289yv);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f110457d = (ImageView) findViewById(C0966R.C0970id.b__);
        this.f110458e = (AppIconView) findViewById(C0966R.C0970id.f15);
        this.f110459f = (TextView) findViewById(C0966R.C0970id.fbd);
        this.f110460g = (TextView) findViewById(C0966R.C0970id.fbe);
        this.f110461h = (TextView) findViewById(C0966R.C0970id.fbw);
        this.f110462i = (FrameLayout) findViewById(C0966R.C0970id.i7q);
        ProgressImageView progressImageView = (ProgressImageView) findViewById(C0966R.C0970id.kfy);
        this.f110463j = progressImageView;
        progressImageView.setOnClickListener(new C41035a(this));
        this.f110464n = (FrameLayout) findViewById(C0966R.C0970id.aom);
        Button button = (Button) findViewById(C0966R.C0970id.hm8);
        this.f110465o = button;
        button.setOnClickListener(new C41038b(this));
        Button button2 = (Button) findViewById(C0966R.C0970id.f85);
        this.f110466p = button2;
        button2.setOnClickListener(new C41039c(this));
        this.f110467q = (DownloadUpdateDescView) findViewById(C0966R.C0970id.l0l);
        this.f110468r = (LinearLayout) findViewById(C0966R.C0970id.c9f);
        this.f110469s = (ImageView) findViewById(C0966R.C0970id.c9h);
        this.f110470t = (TextView) findViewById(C0966R.C0970id.c9g);
        this.f110468r.setOnClickListener(new C46411l(this));
        this.f110471u = findViewById(C0966R.C0970id.m9s);
        this.f110472v = (TextView) findViewById(C0966R.C0970id.mdf);
        this.f110473w = (TextView) findViewById(C0966R.C0970id.m9t);
        this.f110474x = (TextView) findViewById(C0966R.C0970id.m9u);
        this.f110475y = (TextView) findViewById(C0966R.C0970id.m_i);
        this.f110476z = (TextView) findViewById(C0966R.C0970id.m_j);
    }

    public void setData(C40990e0 e0Var) {
        int i;
        C40990e0 e0Var2 = e0Var;
        this.f110454A = e0Var2;
        if (e0Var2 == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f110462i.setVisibility(8);
        this.f110464n.setVisibility(8);
        this.f110467q.setVisibility(8);
        this.f110468r.setVisibility(8);
        C20828a.m22825b().mo32518g(this.f110454A.f110337h, this.f110458e);
        this.f110459f.setText(this.f110454A.f110336g);
        C53736a d = C40933j.m44315d(this.f110454A.f110335f);
        if (d == null || !d.field_autoDownload) {
            this.f110460g.setVisibility(8);
        } else {
            this.f110460g.setVisibility(0);
        }
        if (this.f110454A.f110330a) {
            if (this.f110457d.getVisibility() != 0) {
                this.f110457d.setVisibility(0);
                this.f110457d.startAnimation(AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2483e7));
            }
            setSelected(this.f110454A.f110331b);
            setTaskSize(getFileSize());
            View view = this.f110471u;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/TaskItemView", "setData", "(Lcom/tencent/mm/plugin/downloader_app/model/TaskInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView", "setData", "(Lcom/tencent/mm/plugin/downloader_app/model/TaskInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f110457d.setVisibility(8);
        if (this.f110454A.f110344o != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f110468r.getLayoutParams();
            if (this.f110454A.f110330a) {
                layoutParams.leftMargin = getResources().getDimensionPixelSize(C0966R.dimen.f4290yw);
            } else {
                layoutParams.leftMargin = getResources().getDimensionPixelSize(C0966R.dimen.f4289yv);
            }
            this.f110468r.setLayoutParams(layoutParams);
            this.f110468r.setVisibility(0);
            C20828a.m22825b().mo32518g(this.f110454A.f110344o.f147345d, this.f110469s);
            C52759r rVar = this.f110454A.f110344o.f147346e;
            if (rVar != null) {
                this.f110470t.setText(rVar.f147430e);
            }
            C40990e0 e0Var3 = this.f110454A;
            if (!e0Var3.f110334e) {
                e0Var3.f110334e = true;
                C45880a.m51163b(10, 1006, e0Var3.f110333d, 1, e0Var3.f110335f, "", "");
            }
        } else {
            this.f110468r.setVisibility(8);
        }
        setTaskSize(getFileSize());
        this.f110467q.setVisibility(8);
        C40990e0 e0Var4 = this.f110454A;
        int i2 = e0Var4.f110332c;
        if (i2 == 4) {
            C53736a d2 = C40933j.m44315d(e0Var4.f110335f);
            if (d2 == null || (i = d2.field_status) == 0 || i == 5) {
                this.f110462i.setVisibility(8);
                setButtonText(C0966R.string.k7_);
                this.f110467q.setData(this.f110454A);
            } else {
                mo64068b();
            }
        } else if (i2 == 6) {
            this.f110462i.setVisibility(8);
            setButtonText(C0966R.string.g4y);
        } else {
            mo64068b();
        }
        if (this.f110454A.f110342m == null) {
            View view3 = this.f110471u;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/TaskItemView", "initBrandInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView", "initBrandInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view5 = this.f110471u;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
        aVar3.mo10233c(0);
        View view6 = view5;
        C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/TaskItemView", "initBrandInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view6, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView", "initBrandInfo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        TextView textView = this.f110472v;
        textView.setText(getResources().getString(C0966R.string.lu_) + this.f110454A.f110342m.f147364v);
        TextView textView2 = this.f110473w;
        textView2.setText(getResources().getString(C0966R.string.m19) + this.f110454A.f110342m.f147367y);
        TextView textView3 = this.f110474x;
        textView3.setText(this.f110454A.f110336g + " " + this.f110454A.f110342m.f147361s);
        this.f110475y.setOnClickListener(new C46412m(this));
        this.f110476z.setOnClickListener(new C46413n(this));
    }

    public void setOnItemOpButtonClickListener(C41028a aVar) {
        this.f110456C = aVar;
    }

    public void setSelected(boolean z) {
        Log.m105919d("MicroMsg.TaskItemView", "setSelected selected: %b, appid: %s", Boolean.valueOf(z), this.f110454A.f110335f);
        this.f110454A.f110331b = z;
        if (z) {
            C7171c.m7371a(this.f110457d, "checkbox_cell_on");
        } else {
            C7171c.m7371a(this.f110457d, "checkbox_cell_off");
        }
        ViewParent parent = getParent();
        while (parent != null) {
            if (parent instanceof TaskListView) {
                TaskListView taskListView = (TaskListView) parent;
                Iterator<C40990e0> it = taskListView.f110478C1.f110501d.iterator();
                boolean z2 = false;
                boolean z3 = true;
                while (it.hasNext()) {
                    C40990e0 next = it.next();
                    int i = next.f110332c;
                    if (i == 2 || i == 4 || i == 6) {
                        if (next.f110331b) {
                            z2 = true;
                        } else {
                            z3 = false;
                        }
                    }
                }
                C41008v.m44442b(z2);
                if (!z3) {
                    DeleteTaskFooterView deleteTaskFooterView = ((DownloadMainUI) taskListView.getContext()).f110430e;
                    deleteTaskFooterView.f110425j = false;
                    C7171c.m7371a(deleteTaskFooterView.f110420e, "checkbox_cell_off");
                    return;
                } else if (taskListView.getContext() instanceof DownloadMainUI) {
                    DeleteTaskFooterView deleteTaskFooterView2 = ((DownloadMainUI) taskListView.getContext()).f110430e;
                    deleteTaskFooterView2.f110425j = true;
                    C7171c.m7371a(deleteTaskFooterView2.f110420e, "checkbox_cell_on");
                    return;
                } else {
                    return;
                }
            } else {
                parent = parent.getParent();
            }
        }
    }
}
