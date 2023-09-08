package uq1;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.feature.sight.api.ISightJNIService;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.video.LocalVideoCropInfoParcelable;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import er1.C58741j5;
import f40.C86709a0;
import ft3.C45807d;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import p707tz.C65000f;
import qo1.C63289e;
import te3.C64689rq2;
import te3.C64899zy;
import te3.hi4;
import te3.zr4;
import up1.C37521f;
import up1.C65418l;
import wp1.C66165b;

/* renamed from: uq1.e */
public final class C65433e implements C63289e {

    /* renamed from: a */
    public static final C65433e f188292a = new C65433e();

    /* renamed from: b */
    public static final Object f188293b = new Object();

    /* renamed from: c */
    public static long f188294c;

    /* renamed from: d */
    public static final List<C65434a> f188295d;

    /* renamed from: uq1.e$a */
    public interface C65434a {
        /* renamed from: a */
        List<String> mo89560a();

        String name();
    }

    /* renamed from: uq1.e$b */
    public static final class C65435b implements C65434a {
        /* renamed from: a */
        public List<String> mo89560a() {
            ArrayList arrayList = new ArrayList();
            for (FinderItem c : ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Dx0().Hw0()) {
                C65433e.m77082c(C65433e.f188292a, c, arrayList);
            }
            return arrayList;
        }

        public String name() {
            return "unsentFileClaimer";
        }
    }

    /* renamed from: uq1.e$c */
    public static final class C65436c implements C65434a {
        /* renamed from: a */
        public List<String> mo89560a() {
            int i;
            ArrayList arrayList = new ArrayList();
            C65433e.m77083d(C65433e.f188292a, C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_OPEN_UPLOAD_DRAFT_STRING_SYNC, "").toString(), arrayList);
            C66165b Cx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Cx0();
            ArrayList<C65418l> arrayList2 = new ArrayList<>();
            Cursor rawQuery = Cx0.f190170i.rawQuery("SELECT * FROM FinderDraftItem  WHERE " + Cx0.f190166e + " ORDER BY " + Cx0.f190165d + ".localId DESC", (String[]) null, 2);
            while (rawQuery.moveToNext()) {
                C65418l lVar = new C65418l();
                lVar.convertFrom(rawQuery);
                arrayList2.add(lVar);
            }
            rawQuery.close();
            for (C65418l lVar2 : arrayList2) {
                if (!Util.isNullOrNil(lVar2.field_postIntent) && ((i = lVar2.field_objectType) == 1 || i == 0)) {
                    C65433e eVar = C65433e.f188292a;
                    String str = lVar2.field_postIntent;
                    C87412m.m108593f(str, "it.field_postIntent");
                    C65433e.m77083d(eVar, str, arrayList);
                }
                C65433e.m77082c(C65433e.f188292a, lVar2.mo89514l2(), arrayList);
            }
            return arrayList;
        }

        public String name() {
            return "draftFileClaimer";
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C65435b());
        arrayList.add(new C65436c());
        f188295d = arrayList;
    }

    /* renamed from: c */
    public static final void m77082c(C65433e eVar, FinderItem finderItem, ArrayList arrayList) {
        LinkedList<hi4> linkedList;
        LinkedList<hi4> linkedList2;
        LinkedList<hi4> linkedList3;
        eVar.getClass();
        for (C64689rq2 rq22 : finderItem.getMediaList()) {
            arrayList.add(rq22.f185266d);
            arrayList.add(rq22.f185267e);
            arrayList.add(rq22.f185283w);
            arrayList.add(rq22.f185239F);
            C64899zy zyVar = rq22.f185235B;
            if (!(zyVar == null || (linkedList3 = zyVar.f186899d) == null)) {
                for (hi4 hi4 : linkedList3) {
                    arrayList.add(hi4.f183504d);
                }
            }
        }
        for (C64689rq2 rq23 : finderItem.getHalfVideoMediaExtList()) {
            arrayList.add(rq23.f185266d);
            arrayList.add(rq23.f185267e);
            arrayList.add(rq23.f185283w);
            arrayList.add(rq23.f185239F);
            C64899zy zyVar2 = rq23.f185235B;
            if (!(zyVar2 == null || (linkedList2 = zyVar2.f186899d) == null)) {
                for (hi4 hi42 : linkedList2) {
                    arrayList.add(hi42.f183504d);
                }
            }
        }
        for (FinderItem mediaList : finderItem.getClipListExt()) {
            for (C64689rq2 rq24 : mediaList.getMediaList()) {
                arrayList.add(rq24.f185266d);
                arrayList.add(rq24.f185267e);
                arrayList.add(rq24.f185283w);
                arrayList.add(rq24.f185239F);
                C64899zy zyVar3 = rq24.f185235B;
                if (!(zyVar3 == null || (linkedList = zyVar3.f186899d) == null)) {
                    for (hi4 hi43 : linkedList) {
                        arrayList.add(hi43.f183504d);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public static final void m77083d(C65433e eVar, String str, ArrayList arrayList) {
        eVar.getClass();
        if (!Util.isNullOrNil(str)) {
            try {
                byte[] b = C45807d.m51085b(str);
                Parcel obtain = Parcel.obtain();
                C87412m.m108593f(obtain, "obtain()");
                obtain.unmarshall(b, 0, b.length);
                obtain.setDataPosition(0);
                Intent intent = (Intent) Intent.CREATOR.createFromParcel(obtain);
                intent.setExtrasClassLoader(LocalVideoCropInfoParcelable.CREATOR.getClass().getClassLoader());
                arrayList.add(intent.getStringExtra("VIDEO_COVER_URL"));
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("postMediaList");
                if (stringArrayListExtra == null) {
                    stringArrayListExtra = new ArrayList<>();
                }
                arrayList.addAll(stringArrayListExtra);
            } catch (Exception e) {
                Log.m105920e("finder.FinderPostFileManager", String.valueOf(e));
            }
        }
    }

    /* renamed from: a */
    public String mo88188a(String str, zr4 zr4) {
        C87412m.m108594g(str, "originFilePath");
        String str2 = C58741j5.f168195l + "image_" + MD5Util.getMD5String(str) + '_' + C86013q1.m106452m(str) + "_thumb";
        Log.m105924i("finder.FinderPostFileManager", "genImageThumbFileTmp " + str + ", " + str2 + ", " + zr4);
        mo89553b(str, str2, zr4);
        return str2;
    }

    /* renamed from: b */
    public final String mo89553b(String str, String str2, zr4 zr4) {
        C65449m mVar = C65449m.f188332a;
        if (mVar.mo89565d(str2) && zr4 == null) {
            return str2;
        }
        Point i = mVar.mo89569i(str, 2);
        Bitmap createThumbCropBitmap = BitmapUtil.createThumbCropBitmap(str, i.x, i.y, true);
        Log.m105925i("finder.FinderPostFileManager", "_genImageThumbFile, file %s rotate %d. originThumbWidth:%s, originThumbHeight:%s", str, Integer.valueOf(Exif.fromFile(str).getOrientationInDegree()), Integer.valueOf(i.x), Integer.valueOf(i.y));
        if (createThumbCropBitmap != null) {
            Log.m105925i("finder.FinderPostFileManager", "_genImageThumbFile, file %s cropThumbWidth:%s, cropThumbHeight:%s", str, Integer.valueOf(createThumbCropBitmap.getWidth()), Integer.valueOf(createThumbCropBitmap.getHeight()));
            if (zr4 != null) {
                Log.m105924i("finder.FinderPostFileManager", "thumbRect:[" + zr4.f186847d + ", " + zr4.f186848e + ", " + zr4.f186849f + ", " + zr4.f186850g + "], bitmap:[" + createThumbCropBitmap.getWidth() + ", " + createThumbCropBitmap.getHeight() + ']');
                int width = createThumbCropBitmap.getWidth();
                float f = (float) width;
                int i2 = (int) ((((float) (zr4.f186848e - zr4.f186850g)) / ((float) (zr4.f186849f - zr4.f186847d))) * f);
                Bitmap createBitmap = Bitmap.createBitmap(width, i2, createThumbCropBitmap.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                float f2 = f / ((float) (zr4.f186849f - zr4.f186847d));
                float f3 = ((float) i2) / ((float) (zr4.f186848e - zr4.f186850g));
                StringBuilder sb = new StringBuilder();
                sb.append("widthRatio:");
                sb.append(f2);
                sb.append(", heightRatio:");
                sb.append(f3);
                Log.m105924i("finder.FinderPostFileManager", sb.toString());
                int i3 = (int) (((float) zr4.f186847d) * f2);
                int i4 = (int) (((float) zr4.f186850g) * f3);
                Rect rect = new Rect(i3, i4, width + i3, i2 + i4);
                Log.m105924i("finder.FinderPostFileManager", "genImageThumbFile crop by rect, newThumbRect:" + rect);
                canvas.drawBitmap(createThumbCropBitmap, new Rect(rect.left, rect.top, rect.right, rect.bottom), new Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight()), new Paint());
                BitmapUtil.saveBitmapToImage(createBitmap, 70, Bitmap.CompressFormat.JPEG, str2, false);
            } else {
                BitmapUtil.saveBitmapToImage(createThumbCropBitmap, 70, Bitmap.CompressFormat.JPEG, str2, false);
            }
        }
        return str2;
    }

    /* renamed from: e */
    public final String mo89554e(String str, int i, int i2, Rect rect, String str2) {
        Class cls = C65000f.class;
        if (Util.isNullOrNil(str2)) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            C87412m.m108594g(str, "originFilePath");
            C87412m.m108594g(valueOf, "suffix");
            str2 = C58741j5.f168195l + "video_" + MD5Util.getMD5String(str) + '_' + valueOf + "_thumb";
        }
        String i3 = C86013q1.m106448i(str, false);
        Log.m105924i("finder.FinderPostFileManager", "genVideoThumbFile savepath:" + str2 + ", input:" + i3);
        Bitmap D40 = ((C65000f) C86312j.m106911c(cls)).D40(str);
        Bitmap bitmap = null;
        if (D40 == null) {
            C65449m mVar = C65449m.f188332a;
            if (mVar.mo89565d(str2)) {
                Log.m105924i("finder.FinderPostFileManager", "genVideoThumbFile file exist");
                return str2;
            } else if (((C65000f) C86312j.m106911c(cls)).mo89183Yp(i3) != null) {
                Point i4 = mVar.mo89569i(i3, 4);
                int mp4RotateVFS = ((ISightJNIService) C86312j.m106911c(ISightJNIService.class)).getMp4RotateVFS(i3);
                int i5 = i4.x;
                int i6 = i4.y;
                if (!Util.isNullOrNil(i3)) {
                    Bitmap createVideoThumbnail = BitmapUtil.createVideoThumbnail(i3, 1);
                    if (createVideoThumbnail == null) {
                        Log.m105921e("finder.FinderPostFileManager", "create remux thumb bmp error, target path %s", i3);
                        bitmap = createVideoThumbnail;
                    } else {
                        bitmap = BitmapUtil.extractThumbNail(createVideoThumbnail, i6, i5, true, true);
                    }
                }
                Log.m105925i("finder.FinderPostFileManager", "genVideoThumbFile file %s rotate %d", i3, Integer.valueOf(mp4RotateVFS));
                if (bitmap != null) {
                    BitmapUtil.saveBitmapToImage(bitmap, 70, Bitmap.CompressFormat.JPEG, str2, false);
                }
            }
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, D40.getConfig());
            Canvas canvas = new Canvas(createBitmap);
            if (rect != null) {
                Log.m105924i("finder.FinderPostFileManager", "genVideoThumbFile crop by rect");
                canvas.drawBitmap(D40, new Rect(rect.left, rect.bottom, rect.right, rect.top), new Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight()), new Paint());
            } else {
                Log.m105924i("finder.FinderPostFileManager", "genVideoThumbFile no rect");
                canvas.drawBitmap(D40, (Rect) null, new Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight()), new Paint());
            }
            BitmapUtil.saveBitmapToImage(createBitmap, 80, Bitmap.CompressFormat.JPEG, str2, false);
        }
        if (!C86013q1.m106450k(str2)) {
            Log.m105920e("finder.FinderPostFileManager", "genVideoThumbFile failed.");
        }
        return str2;
    }

    /* renamed from: f */
    public final String mo89555f(String str, int i, int i2, Rect rect) {
        C87412m.m108594g(str, "input");
        return mo89556g(str, C58741j5.f168184a.mo83735i(str), i, i2, rect);
    }

    /* renamed from: g */
    public final String mo89556g(String str, String str2, int i, int i2, Rect rect) {
        C87412m.m108594g(str, "input");
        C87412m.m108594g(str2, "dstPath");
        Log.m105924i("finder.FinderPostFileManager", "genVideoThumbFileForPost input:" + str + ", targetWidth:" + i + ", targetHeight:" + i2 + ", thumbRect:" + rect + ", dstPath:" + str2);
        return mo89554e(str, i, i2, rect, str2);
    }

    /* renamed from: h */
    public final String mo89557h(String str) {
        C87412m.m108594g(str, "input");
        Point i = C65449m.f188332a.mo89569i(str, 4);
        Log.m105924i("finder.FinderPostFileManager", "genVideoThumbFileTmp input:" + str + ", targetWidth:" + i.x + ", targetHeight:" + i.y);
        return mo89554e(str, i.x, i.y, (Rect) null, "");
    }

    /* renamed from: i */
    public final String mo89558i(String str, zr4 zr4) {
        C87412m.m108594g(str, "input");
        C87412m.m108594g(zr4, "thumbRect");
        int i = C37521f.f99374d.mo61162P().f267179t;
        int i2 = (int) ((((float) (zr4.f186848e - zr4.f186850g)) / ((float) (zr4.f186849f - zr4.f186847d))) * ((float) i));
        Rect rect = new Rect(zr4.f186847d, zr4.f186848e, zr4.f186849f, zr4.f186850g);
        Log.m105924i("finder.FinderPostFileManager", "genVideoThumbFileTmp input:" + str + ", targetWidth:" + i + ", targetHeight:" + i2 + ", thumbRect:" + rect);
        return mo89554e(str, i, i2, rect, "");
    }

    /* renamed from: j */
    public final void mo89559j(String str) {
        C87412m.m108594g(str, "path");
        synchronized (f188293b) {
            Log.m105924i("finder.FinderPostFileManager", "FinderFileTrack markPostFileToDelete " + str);
            MultiProcessMMKV singleDefault = MultiProcessMMKV.getSingleDefault();
            Set<String> stringSet = singleDefault.getStringSet("MARK_DEL_FILES", new HashSet());
            C87412m.m108591d(stringSet);
            stringSet.add(str);
            singleDefault.putStringSet("MARK_DEL_FILES", stringSet).commit();
        }
    }
}
