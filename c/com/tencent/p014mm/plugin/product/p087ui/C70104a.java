package com.tencent.p014mm.plugin.product.p087ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import bf2.C67223a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.product.ui.a */
public class C70104a extends BaseAdapter {

    /* renamed from: d */
    public Context f202364d;

    /* renamed from: e */
    public List<C67223a> f202365e;

    /* renamed from: f */
    public List<Boolean> f202366f;

    /* renamed from: g */
    public int f202367g = 1;

    public C70104a(Context context) {
        this.f202364d = context;
    }

    /* renamed from: a */
    public void mo96490a(Activity activity, View view, int i) {
        C70105b bVar = (C70105b) view.getTag();
        Log.m105924i("MicroMsg.MallCustomActionAdapter", "onItemClick holder.type" + bVar.f202373f);
        Log.m105924i("MicroMsg.MallCustomActionAdapter", "onItemClick holder.content" + bVar.f202374g);
        int i2 = bVar.f202373f;
        if (i2 == 0) {
            return;
        }
        if (i2 == 1) {
            Object obj = bVar.f202374g;
            if (obj instanceof String) {
                C75228t.m90220M(this.f202364d, (String) obj, false, 10000);
            }
        } else if (i2 != 2) {
            if (i2 != 4) {
                if (i2 == 5) {
                    if (((Boolean) ((ArrayList) this.f202366f).get(i)).booleanValue()) {
                        ((ArrayList) this.f202366f).set(i, Boolean.FALSE);
                    } else {
                        ((ArrayList) this.f202366f).set(i, Boolean.TRUE);
                    }
                    notifyDataSetChanged();
                    return;
                } else if (i2 != 6) {
                    Log.m105928w("MicroMsg.MallCustomActionAdapter", "not support type");
                    return;
                }
            }
            Object obj2 = bVar.f202374g;
            if (obj2 instanceof String) {
                Intent intent = new Intent();
                intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, bVar.f202372e);
                intent.putExtra("neverGetA8Key", false);
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                intent.putExtra("data", (String) obj2);
                intent.putExtra("QRDataFlag", false);
                C75228t.m90217J(activity, intent);
            }
        } else {
            Object obj3 = bVar.f202374g;
            if (obj3 instanceof ArrayList) {
                Intent intent2 = new Intent(activity, MallGalleryUI.class);
                intent2.putExtra("keys_img_urls", (ArrayList) obj3);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/product/ui/MallCustomActionAdapter", "onItemClick", "(Landroid/app/Activity;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity, "com/tencent/mm/plugin/product/ui/MallCustomActionAdapter", "onItemClick", "(Landroid/app/Activity;Landroid/view/View;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    /* renamed from: b */
    public void mo96491b(List<C67223a> list) {
        this.f202365e = list;
        this.f202367g = 0;
        this.f202366f = new ArrayList();
        if (this.f202365e != null) {
            HashSet hashSet = new HashSet();
            for (C67223a aVar : list) {
                this.f202366f.add(Boolean.FALSE);
                hashSet.add(Integer.valueOf(aVar.f193021f));
            }
            this.f202367g = list.size();
        }
        if (this.f202367g < 1) {
            this.f202367g = 1;
        }
    }

    public int getCount() {
        List<C67223a> list = this.f202365e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public Object getItem(int i) {
        return this.f202365e.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        return this.f202365e.get(i).f193021f;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C70105b bVar;
        if (view == null) {
            view = View.inflate(this.f202364d, C0966R.C0971layout.bo5, (ViewGroup) null);
            bVar = new C70105b();
            bVar.f202368a = (TextView) view.findViewById(C0966R.C0970id.kpm);
            bVar.f202369b = (TextView) view.findViewById(C0966R.C0970id.ka6);
            bVar.f202370c = (ImageView) view.findViewById(C0966R.C0970id.f6g);
            bVar.f202371d = (HtmlTextView) view.findViewById(C0966R.C0970id.c3n);
            view.setTag(bVar);
        } else {
            bVar = (C70105b) view.getTag();
        }
        C67223a aVar = this.f202365e.get(i);
        if (aVar != null) {
            bVar.f202368a.setText(aVar.f193019d);
            bVar.f202369b.setText(aVar.f193020e);
            int i2 = aVar.f193021f;
            bVar.f202373f = i2;
            bVar.f202374g = aVar.f193022g;
            bVar.f202372e = aVar.f193019d;
            if (i2 == 0) {
                bVar.f202370c.setVisibility(8);
            } else if (i2 == 5 || i2 == 6) {
                if (((Boolean) ((ArrayList) this.f202366f).get(i)).booleanValue()) {
                    bVar.f202371d.setVisibility(0);
                } else {
                    bVar.f202371d.setVisibility(8);
                }
                if (!bVar.f202371d.getText().equals(aVar.f193022g)) {
                    bVar.f202371d.setText(aVar.f193022g);
                }
            }
        }
        return view;
    }

    public int getViewTypeCount() {
        return this.f202367g;
    }
}
