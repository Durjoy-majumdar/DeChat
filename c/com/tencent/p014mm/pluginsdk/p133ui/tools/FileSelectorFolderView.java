package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorFolderView */
public class FileSelectorFolderView extends LinearLayout implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public FrameLayout f212492d;

    /* renamed from: e */
    public View f212493e;

    /* renamed from: f */
    public ListView f212494f;

    /* renamed from: g */
    public boolean f212495g = false;

    /* renamed from: h */
    public boolean f212496h = false;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorFolderView$a */
    public class C72905a implements View.OnClickListener {
        public C72905a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorFolderView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FileSelectorFolderView fileSelectorFolderView = FileSelectorFolderView.this;
            boolean z = fileSelectorFolderView.f212495g;
            if (!z) {
                Log.m105919d("MicroMsg.FileSelectorFolderView", "want to expand, but same status, expanded %B", Boolean.valueOf(z));
            } else if (fileSelectorFolderView.f212496h) {
                Log.m105919d("MicroMsg.FileSelectorFolderView", "want to expand[%B], but now in animation", Boolean.FALSE);
            } else if (z) {
                fileSelectorFolderView.f212496h = true;
                Animation loadAnimation = AnimationUtils.loadAnimation(fileSelectorFolderView.getContext(), C0966R.C0968anim.f2469dt);
                loadAnimation.setAnimationListener(new C72935y(fileSelectorFolderView));
                fileSelectorFolderView.f212494f.startAnimation(loadAnimation);
                fileSelectorFolderView.f212493e.startAnimation(AnimationUtils.loadAnimation(fileSelectorFolderView.getContext(), C0966R.C0968anim.f2394bx));
            } else {
                fileSelectorFolderView.f212496h = true;
                fileSelectorFolderView.f212492d.setVisibility(0);
                fileSelectorFolderView.f212493e.startAnimation(AnimationUtils.loadAnimation(fileSelectorFolderView.getContext(), C0966R.C0968anim.f2393bw));
                Animation loadAnimation2 = AnimationUtils.loadAnimation(fileSelectorFolderView.getContext(), C0966R.C0968anim.f2471dv);
                loadAnimation2.setAnimationListener(new C72936z(fileSelectorFolderView));
                fileSelectorFolderView.f212494f.startAnimation(loadAnimation2);
            }
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorFolderView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorFolderView$b */
    public interface C72906b {
        /* renamed from: a */
        void mo100781a(int i);
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorFolderView$c */
    public static class C72907c extends BaseAdapter {

        /* renamed from: d */
        public Context f212498d;

        public C72907c(Context context) {
            this.f212498d = context;
        }

        public int getCount() {
            return 2;
        }

        public Object getItem(int i) {
            return Integer.valueOf(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C72908d dVar;
            if (view == null || view.getTag() == null) {
                view = LayoutInflater.from(this.f212498d).inflate(C0966R.C0971layout.aru, (ViewGroup) null);
                dVar = new C72908d(view);
                view.setTag(dVar);
            } else {
                dVar = (C72908d) view.getTag();
            }
            if (i == 0) {
                dVar.f212499a.setText(C0966R.string.cup);
            } else if (i != 1) {
                dVar.f212499a.setText(C0966R.string.f7961xj);
            } else {
                dVar.f212499a.setText(C0966R.string.cuq);
            }
            return view;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.FileSelectorFolderView$d */
    public static class C72908d {

        /* renamed from: a */
        public TextView f212499a;

        public C72908d(View view) {
            this.f212499a = (TextView) view.findViewById(C0966R.C0970id.f358474fc2);
        }
    }

    public FileSelectorFolderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo100777a();
    }

    /* renamed from: a */
    public final void mo100777a() {
        setOrientation(1);
        this.f212492d = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.f212492d.setVisibility(8);
        addView(this.f212492d, layoutParams);
        View view = new View(getContext());
        this.f212493e = view;
        view.setBackgroundColor(-872415232);
        this.f212493e.setOnClickListener(new C72905a());
        this.f212492d.addView(this.f212493e, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(getContext());
        this.f212494f = listView;
        listView.setCacheColorHint(0);
        this.f212494f.setBackgroundColor(getContext().getResources().getColor(C0966R.color.f2932f));
        this.f212494f.setSelector(C0966R.C0969drawable.ags);
        this.f212494f.setOnItemClickListener(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.f3926j6);
        this.f212494f.setPadding(dimensionPixelSize, dimensionPixelSize / 3, dimensionPixelSize, 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = getResources().getDimensionPixelSize(C0966R.dimen.f3679b9);
        layoutParams2.gravity = 80;
        this.f212492d.addView(this.f212494f, layoutParams2);
        this.f212494f.setAdapter(new C72907c(getContext()));
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/tools/FileSelectorFolderView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f212493e.performClick();
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/tools/FileSelectorFolderView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public void setListener(C72906b bVar) {
    }

    public FileSelectorFolderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo100777a();
    }
}
