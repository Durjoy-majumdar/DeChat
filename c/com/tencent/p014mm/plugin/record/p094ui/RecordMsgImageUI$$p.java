package com.tencent.p014mm.plugin.record.p094ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93624e;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavVideoView;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.sdk.platformtools.ForceGpuUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import qg2.C101141g0;
import qg2.C101147j0;
import te3.C101834rc0;
import wa3.C102364c;
import wa3.C102365e;
import wa3.C102375n;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$p */
public class RecordMsgImageUI$$p extends BaseAdapter {

    /* renamed from: d */
    public List<C93624e> f272674d = new LinkedList();

    /* renamed from: e */
    public long f272675e = -1;

    /* renamed from: f */
    public C101141g0 f272676f;

    /* renamed from: g */
    public final /* synthetic */ RecordMsgImageUI f272677g;

    /* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$p$a */
    public class C94343a implements FavVideoView.C93722g {
        public C94343a() {
        }

        public void finish() {
            RecordMsgImageUI$$p.this.f272677g.finish();
        }
    }

    public RecordMsgImageUI$$p(RecordMsgImageUI recordMsgImageUI, RecordMsgImageUI$$h recordMsgImageUI$$h) {
        this.f272677g = recordMsgImageUI;
    }

    /* renamed from: a */
    public C93624e getItem(int i) {
        return this.f272674d.get(i);
    }

    public int getCount() {
        return this.f272674d.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        if (i > this.f272674d.size()) {
            return 2;
        }
        return this.f272674d.get(i).mo128525k();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        MultiTouchImageView multiTouchImageView;
        View view2 = view;
        C93624e a = getItem(i);
        Log.m105919d("MicroMsg.ShowImageUI", "getView() called with: position = [" + i + "], convertView = [" + view2 + "], parent = [" + viewGroup + "] itemType:%s", Integer.valueOf(a.mo128525k()));
        int k = a.mo128525k();
        if (k == 15 || k == 4) {
            if (view2 == null) {
                view2 = new FavVideoView(this.f272677g.getContext(), (AttributeSet) null);
                ((ArrayList) this.f272677g.f272632e).add(view2);
            }
            String j = a.mo128524j();
            List list = this.f272677g.f272633f.get(j);
            if (list == null) {
                list = new ArrayList();
            }
            FavVideoView favVideoView = (FavVideoView) view2;
            list.add(favVideoView);
            this.f272677g.f272633f.put(j, list);
            favVideoView.f270533i.setVisibility(8);
            favVideoView.setCallback(new C94343a());
            if (C86013q1.m106450k(j)) {
                favVideoView.setVideoData(j);
                favVideoView.setThumbView(a.mo128537w());
                Log.m105924i("MicroMsg.ShowImageUI", "VideoPlay:  videoView.setVideoData(fullPath)");
            } else {
                Log.m105925i("MicroMsg.ShowImageUI", "VideoPlay:  videoView.initThumbView thumbExist:%s", Boolean.valueOf(C86013q1.m106450k(a.mo128537w())));
                favVideoView.mo128635h(a.mo128524j(), true, a.mo128523i());
                favVideoView.setThumbView(a.mo128537w());
                C101141g0 g0Var = this.f272676f;
                String i2 = a.mo128523i();
                long j2 = this.f272675e;
                boolean e = g0Var.mo140589e(i2, j2);
                Log.m105918d("MicroMsg.RecordMsgImgService", "tryDownloadVideo() called with: dataItem = [" + i2 + "], msgId = [" + j2 + "] canRetry:" + e);
                if (e) {
                    C102365e Rd = C102364c.vx0().mo137946Rd();
                    if (Rd instanceof C102375n) {
                        C101147j0.m132618K(((C102375n) Rd).mo141943e(i2), j2, false);
                    }
                }
            }
            if (C85875k4.m106157N()) {
                favVideoView.setVideoScaleType(C96814a.C96817e.CONTAIN);
            } else {
                favVideoView.setVideoScaleType(C96814a.C96817e.DEFAULT);
            }
            return view2;
        }
        C101141g0 g0Var2 = this.f272676f;
        C101834rc0 n = getItem(i).mo128528n();
        long j3 = this.f272675e;
        long j4 = j3;
        Bitmap g = g0Var2.mo140591g(n, j3, false, false);
        if (g == null) {
            long j5 = j4;
            boolean e2 = g0Var2.mo140589e(n.f299280T, j5);
            Log.m105919d("MicroMsg.RecordMsgImgService", "get image fail, try download, can retry:%B", Boolean.valueOf(e2));
            if (e2) {
                C101147j0.m132618K(n, j5, e2);
            }
        }
        if (g == null) {
            Log.m105928w("MicroMsg.ShowImageUI", "get image fail");
            if (view2 == null || (view2 instanceof MultiTouchImageView)) {
                view2 = View.inflate(viewGroup.getContext(), C0966R.C0971layout.bza, (ViewGroup) null);
            }
            ImageView imageView = (ImageView) view2.findViewById(C0966R.C0970id.f357835c02);
            imageView.setVisibility(0);
            imageView.setImageResource(C0966R.raw.download_image_icon);
            view2.setLayoutParams(new Gallery.LayoutParams(-1, -1));
            return view2;
        }
        Context context = viewGroup.getContext();
        if (view2 == null || !(view2 instanceof MultiTouchImageView)) {
            multiTouchImageView = new MultiTouchImageView(context, g.getWidth(), g.getHeight());
        } else {
            multiTouchImageView = (MultiTouchImageView) view2;
            int width = g.getWidth();
            int height = g.getHeight();
            multiTouchImageView.f348280o = width;
            multiTouchImageView.f348281p = height;
        }
        ForceGpuUtil.decideLayerType(multiTouchImageView, g.getWidth(), g.getHeight());
        multiTouchImageView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
        multiTouchImageView.setImageBitmap(g);
        multiTouchImageView.setMaxZoomDoubleTab(true);
        return multiTouchImageView;
    }
}
