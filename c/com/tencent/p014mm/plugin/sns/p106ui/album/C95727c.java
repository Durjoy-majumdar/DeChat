package com.tencent.p014mm.plugin.sns.p106ui.album;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.QDisFadeImageView;
import com.tencent.p014mm.p136ui.widget.QImageView;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p106ui.SnsGalleryUI;
import com.tencent.p014mm.plugin.sns.p106ui.album.C95716a;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import os2.C100417r0;
import te3.C101804kv2;
import te3.C101829pp1;

/* renamed from: com.tencent.mm.plugin.sns.ui.album.c */
public class C95727c extends RecyclerView.C16613e<C95729b> {

    /* renamed from: d */
    public List<C95716a.C95721e> f279199d = new ArrayList();

    /* renamed from: e */
    public C95728a f279200e = null;

    /* renamed from: com.tencent.mm.plugin.sns.ui.album.c$a */
    public interface C95728a {
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.album.c$b */
    public class C95729b extends RecyclerView.C16631z {

        /* renamed from: A */
        public ImageView f279201A = null;

        /* renamed from: z */
        public QDisFadeImageView f279203z = null;

        /* renamed from: com.tencent.mm.plugin.sns.ui.album.c$b$a */
        public class C95730a implements View.OnClickListener {
            public C95730a(C95727c cVar) {
            }

            public void onClick(View view) {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                String str7;
                Intent intent;
                String str8;
                String str9;
                C5431p1.C5432a aVar;
                int i;
                String str10;
                String str11;
                Intent intent2;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/sns/ui/album/SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1");
                if (view.getTag() != null && (view.getTag() instanceof C95731c)) {
                    C95727c cVar = C95727c.this;
                    SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
                    C95728a aVar2 = cVar.f279200e;
                    SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
                    if (aVar2 != null) {
                        C95727c cVar2 = C95727c.this;
                        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
                        C95728a aVar3 = cVar2.f279200e;
                        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
                        int i2 = ((C95731c) view.getTag()).f279205a;
                        String str12 = ((C95731c) view.getTag()).f279206b;
                        C95732d dVar = (C95732d) aVar3;
                        dVar.getClass();
                        SnsMethodCalculate.markStartTimeMs("onGridItemClick", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$3");
                        Log.m105925i("MicroMsg.SnsAlbumUI", "onClickItem localId=%s, mediaId=%s", Integer.valueOf(i2), str12);
                        SnsAlbumUI snsAlbumUI = dVar.f279207a;
                        int i3 = SnsAlbumUI.f279150r;
                        String str13 = "access$100";
                        String str14 = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI";
                        SnsMethodCalculate.markStartTimeMs(str13, str14);
                        snsAlbumUI.getClass();
                        String str15 = "goSnsGallery";
                        SnsMethodCalculate.markStartTimeMs(str15, str14);
                        Intent intent3 = new Intent(snsAlbumUI.getActivity(), SnsGalleryUI.class);
                        intent3.putExtra("sns_gallery_userName", snsAlbumUI.f279156i);
                        intent3.putExtra("sns_gallery_is_self", Util.isEqual(snsAlbumUI.f279155h, snsAlbumUI.f279156i));
                        intent3.putExtra("sns_gallery_localId", i2);
                        intent3.putExtra("sns_source", snsAlbumUI.f279157j);
                        intent3.putExtra("sns_video_scene", 3);
                        intent3.putExtra("key_from_scene", 5);
                        C95716a aVar4 = snsAlbumUI.f279154g;
                        if (aVar4 != null) {
                            SnsMethodCalculate.markStartTimeMs("getLimtiSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                            String str16 = aVar4.f279166g;
                            SnsMethodCalculate.markEndTimeMs("getLimtiSeq", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                            intent3.putExtra("sns_gallery_limit_seq", str16);
                            C5431p1.C5432a aVar5 = snsAlbumUI.f279159o;
                            String str17 = snsAlbumUI.f279156i;
                            C95716a aVar6 = snsAlbumUI.f279154g;
                            aVar6.getClass();
                            SnsMethodCalculate.markStartTimeMs("makeGalleryItems", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                            str2 = "onClick";
                            str = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1";
                            String str18 = "MicroMsg.SnsAlbumAdapter";
                            str7 = "onGridItemClick";
                            Log.m105919d(str18, "snsLocalId=%s", Integer.valueOf(i2));
                            ArrayList arrayList2 = new ArrayList();
                            str6 = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$3";
                            int i4 = 0;
                            while (i4 < ((ArrayList) aVar6.f279163d).size()) {
                                Iterator<SnsInfo> it = ((C95716a.C95719c) ((ArrayList) aVar6.f279163d).get(i4)).f279178a.iterator();
                                while (it.hasNext()) {
                                    Iterator<SnsInfo> it4 = it;
                                    SnsInfo next = it.next();
                                    String str19 = str13;
                                    int i5 = next.localid;
                                    if (next.getTimeLine() != null) {
                                        str11 = str14;
                                        if (next.getTimeLine().ContentObj == null || next.getTimeLine().ContentObj.f298427h.size() == 0) {
                                            str8 = str18;
                                            i = i2;
                                            str9 = str12;
                                        } else {
                                            str10 = str15;
                                            if (next.getTimeLine().ContentObj.f298424e == 1 || next.getTimeLine().ContentObj.f298424e == 15) {
                                                if (i5 == i2) {
                                                    Log.m105919d(str18, "mFixPosition=%s", Integer.valueOf(aVar6.f279171o));
                                                    aVar6.f279171o = arrayList2.size();
                                                }
                                                Iterator<C101804kv2> it5 = next.getTimeLine().ContentObj.f298427h.iterator();
                                                int i6 = 0;
                                                while (it5.hasNext()) {
                                                    String str20 = str18;
                                                    C101804kv2 next2 = it5.next();
                                                    int i7 = i2;
                                                    if (Util.isEqual(next2.f298689d, str12)) {
                                                        aVar6.f279171o += i6;
                                                    }
                                                    C101829pp1 pp12 = new C101829pp1();
                                                    pp12.f299180d = next2;
                                                    pp12.f299181e = C100417r0.m131420i("sns_table_", (long) i5);
                                                    pp12.f299182f = next.getCreateTime();
                                                    pp12.f299183g = i6;
                                                    arrayList2.add(pp12);
                                                    intent3 = intent3;
                                                    i6++;
                                                    i2 = i7;
                                                    aVar5 = aVar5;
                                                    str12 = str12;
                                                    str18 = str20;
                                                }
                                                str8 = str18;
                                                i = i2;
                                                str9 = str12;
                                                intent2 = intent3;
                                                aVar = aVar5;
                                                intent3 = intent2;
                                                str13 = str19;
                                                it = it4;
                                                str14 = str11;
                                                str15 = str10;
                                                i2 = i;
                                                aVar5 = aVar;
                                                str12 = str9;
                                                str18 = str8;
                                            } else {
                                                str13 = str19;
                                                it = it4;
                                                str14 = str11;
                                                str15 = str10;
                                            }
                                        }
                                    } else {
                                        str8 = str18;
                                        i = i2;
                                        str9 = str12;
                                        str11 = str14;
                                    }
                                    str10 = str15;
                                    intent2 = intent3;
                                    aVar = aVar5;
                                    intent3 = intent2;
                                    str13 = str19;
                                    it = it4;
                                    str14 = str11;
                                    str15 = str10;
                                    i2 = i;
                                    aVar5 = aVar;
                                    str12 = str9;
                                    str18 = str8;
                                }
                                String str21 = str18;
                                int i8 = i2;
                                String str22 = str12;
                                String str23 = str13;
                                String str24 = str14;
                                String str25 = str15;
                                Intent intent4 = intent3;
                                C5431p1.C5432a aVar7 = aVar5;
                                i4++;
                                str18 = str21;
                            }
                            str5 = str13;
                            str4 = str14;
                            str3 = str15;
                            intent = intent3;
                            SnsMethodCalculate.markEndTimeMs("makeGalleryItems", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                            aVar5.mo6419p(str17, arrayList2);
                            C95716a aVar8 = snsAlbumUI.f279154g;
                            aVar8.getClass();
                            SnsMethodCalculate.markStartTimeMs("getFixPosition", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                            int i9 = aVar8.f279171o;
                            SnsMethodCalculate.markEndTimeMs("getFixPosition", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumAdapter");
                            intent.putExtra("sns_gallery_position", i9);
                        } else {
                            str2 = "onClick";
                            str = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1";
                            str7 = "onGridItemClick";
                            str6 = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$3";
                            str5 = str13;
                            str4 = str14;
                            str3 = str15;
                            intent = intent3;
                        }
                        snsAlbumUI.startActivityForResult(intent, 8);
                        String str26 = str4;
                        SnsMethodCalculate.markEndTimeMs(str3, str26);
                        SnsMethodCalculate.markEndTimeMs(str5, str26);
                        SnsMethodCalculate.markEndTimeMs(str7, str6);
                        String str27 = str2;
                        SnsMethodCalculate.markEndTimeMs(str27, str);
                        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/album/SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1", "android/view/View$OnClickListener", str27, "(Landroid/view/View;)V");
                    }
                }
                str2 = "onClick";
                str = "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1";
                String str272 = str2;
                SnsMethodCalculate.markEndTimeMs(str272, str);
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/album/SnsAlbumItemAdapter$SnsAlbumItemViewHolder$1", "android/view/View$OnClickListener", str272, "(Landroid/view/View;)V");
            }
        }

        public C95729b(View view) {
            super(view);
            this.f279203z = (QDisFadeImageView) view.findViewById(C0966R.C0970id.jrf);
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.jrg);
            this.f279201A = imageView;
            imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(C0966R.raw.shortvideo_play_btn));
            this.f279203z.setScaleType(QImageView.C97274a.CENTER_CROP);
            this.f279203z.setOnClickListener(new C95730a(C95727c.this));
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.album.c$c */
    public class C95731c {

        /* renamed from: a */
        public int f279205a;

        /* renamed from: b */
        public String f279206b;

        public C95731c(C95727c cVar) {
        }
    }

    public int getItemCount() {
        SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        int size = ((ArrayList) this.f279199d).size();
        SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        return size;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        C95729b bVar = (C95729b) zVar;
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter$SnsAlbumItemViewHolder");
        C95727c cVar = C95727c.this;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        List<C95716a.C95721e> list = cVar.f279199d;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        C101804kv2 kv22 = ((C95716a.C95721e) ((ArrayList) list).get(i2)).f279183b;
        Log.m105919d("MicroMsg.SnsAlbumItemAdapter", "onBind position:%s, obj.Type:%s", Integer.valueOf(i), Integer.valueOf(kv22.f298690e));
        C94901o Fx0 = C94866e1.Fx0();
        QDisFadeImageView qDisFadeImageView = bVar.f279203z;
        int hashCode = qDisFadeImageView.getContext().hashCode();
        C94901o.C94911h hVar = C94901o.C94911h.IMG_SCENE_SNSUSER;
        C96983o3 o3Var = new C96983o3("album_self");
        Fx0.getClass();
        SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        String str = "onBindViewHolder";
        Fx0.mo131102V(kv22, qDisFadeImageView, -1, hashCode, hVar, o3Var);
        SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        C95727c cVar2 = C95727c.this;
        C95731c cVar3 = new C95731c(cVar2);
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        List<C95716a.C95721e> list2 = cVar2.f279199d;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        cVar3.f279205a = ((C95716a.C95721e) ((ArrayList) list2).get(i2)).f279182a;
        cVar3.f279206b = kv22.f298689d;
        bVar.f279203z.setTag(cVar3);
        bVar.f279201A.setVisibility(kv22.f298690e == 6 ? 0 : 8);
        SnsMethodCalculate.markEndTimeMs("onBind", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter$SnsAlbumItemViewHolder");
        String str2 = str;
        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        C95729b bVar = new C95729b(LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f359999c24, viewGroup, false));
        SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumItemAdapter");
        return bVar;
    }
}
