package i72;

import android.graphics.Point;
import android.hardware.Camera;
import android.util.Size;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f72.C97842b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: i72.i */
public class C108383i {

    /* renamed from: i72.i$b */
    public static class C108385b implements Comparator<Size> {
        public C108385b(C108384a aVar) {
        }

        public int compare(Object obj, Object obj2) {
            Size size = (Size) obj;
            Size size2 = (Size) obj2;
            int height = size.getHeight() * size.getWidth();
            int height2 = size2.getHeight() * size2.getWidth();
            if (height2 < height) {
                return -1;
            }
            return height2 > height ? 1 : 0;
        }
    }

    /* renamed from: i72.i$c */
    public static class C108386c implements Comparator<Camera.Size> {
        public C108386c(C108384a aVar) {
        }

        public int compare(Object obj, Object obj2) {
            Camera.Size size = (Camera.Size) obj;
            Camera.Size size2 = (Camera.Size) obj2;
            int i = size.height * size.width;
            int i2 = size2.height * size2.width;
            if (i2 < i) {
                return -1;
            }
            return i2 > i ? 1 : 0;
        }
    }

    /* renamed from: i72.i$d */
    public static class C108387d {

        /* renamed from: a */
        public Point f324531a;

        /* renamed from: b */
        public Point f324532b;

        /* renamed from: c */
        public Point f324533c;

        /* renamed from: d */
        public Point f324534d;

        /* renamed from: e */
        public Point f324535e;

        /* renamed from: f */
        public Point f324536f;

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            if (this.f324531a != null) {
                stringBuffer.append(this.f324531a.toString() + ",");
            }
            if (this.f324532b != null) {
                stringBuffer.append(this.f324532b.toString() + ",");
            }
            if (this.f324533c != null) {
                stringBuffer.append(this.f324533c.toString() + ",");
            }
            if (this.f324534d != null) {
                stringBuffer.append(this.f324534d.toString() + ",");
            }
            if (this.f324535e != null) {
                stringBuffer.append(this.f324535e.toString() + ",");
            }
            if (this.f324536f != null) {
                stringBuffer.append(this.f324536f.toString() + ",");
            }
            return stringBuffer.toString();
        }
    }

    /* renamed from: a */
    public static Point m146826a(ArrayList<Camera.Size> arrayList, Point point, boolean z, int i) {
        int i2;
        int i3 = point.x;
        int i4 = point.y * i;
        if (i4 % i3 != 0) {
            return null;
        }
        int i5 = i4 / i3;
        if (z) {
            int i6 = i ^ i5;
            i5 ^= i6;
            i2 = i6 ^ i5;
        } else {
            i2 = i;
        }
        Iterator<Camera.Size> it = arrayList.iterator();
        while (it.hasNext()) {
            Camera.Size next = it.next();
            int i7 = next.width;
            if (i7 != i2 || next.height != i5) {
                if (Math.min(i7, next.height) < i) {
                    break;
                }
            } else {
                Log.m105925i("MicroMsg.MMSightCameraInfo", "findEqualsPrewViewSize FindBestSize %d %d", Integer.valueOf(i2), Integer.valueOf(i5));
                return new Point(i2, i5);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Point m146827b(Size[] sizeArr, Point point, boolean z, int i) {
        int i2;
        int i3 = point.x;
        int i4 = point.y * i;
        if (i4 % i3 != 0) {
            return null;
        }
        int i5 = i4 / i3;
        if (z) {
            int i6 = i ^ i5;
            i5 ^= i6;
            i2 = i6 ^ i5;
        } else {
            i2 = i;
        }
        int length = sizeArr.length;
        int i7 = 0;
        while (i7 < length) {
            Size size = sizeArr[i7];
            if (size.getWidth() == i2 && size.getHeight() == i5) {
                Log.m105925i("MicroMsg.MMSightCameraInfo", "findEqualsPrewViewSize FindBestSize %d %d", Integer.valueOf(i2), Integer.valueOf(i5));
                return new Point(i2, i5);
            } else if (Math.min(size.getWidth(), size.getHeight()) < i) {
                return null;
            } else {
                i7++;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static C108387d m146829c(Size[] sizeArr, Point point, int i, boolean z) {
        Point point2;
        Size[] sizeArr2 = sizeArr;
        Point point3 = point;
        boolean z2 = z;
        Arrays.sort(sizeArr2, new C108385b((C108384a) null));
        Log.m105925i("MicroMsg.MMSightCameraInfo", "findPreviewSizeWithoutCrop isRotate: %b, supportedPreviewSizes: %s", Boolean.valueOf(z), C97842b.m126304u(sizeArr));
        int i2 = point3.x;
        float f = ((float) i2) / ((float) point3.y);
        Log.m105925i("MicroMsg.MMSightCameraInfo", "screen.x: %d, screen.y: %d, ratio: %f, upperBoundPrewView: %s ", Integer.valueOf(i2), Integer.valueOf(point3.y), Float.valueOf(f), Integer.valueOf(i));
        Log.m105919d("MicroMsg.MMSightCameraInfo", "systemAvailableMemInMB: %d", Long.valueOf(Util.getAvailableMemoryMB(MMApplicationContext.getContext())));
        C108387d dVar = new C108387d();
        int i3 = ((int) (((float) i) * 1.05f)) + 64;
        int length = sizeArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                point2 = null;
                break;
            }
            Size size = sizeArr2[i4];
            float height = ((float) size.getHeight()) / ((float) size.getWidth());
            if (size.getHeight() <= i3 && size.getWidth() <= 2000 && height == f) {
                point2 = new Point();
                point2.x = size.getWidth();
                point2.y = size.getHeight();
                break;
            }
            i4++;
        }
        if (point2 == null) {
            int length2 = sizeArr2.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length2) {
                    break;
                }
                Size size2 = sizeArr2[i5];
                if (size2.getHeight() > i3 || size2.getWidth() > 2000) {
                    i5++;
                } else if (point2 == null) {
                    point2 = new Point();
                    point2.x = size2.getWidth();
                    point2.y = size2.getHeight();
                }
            }
        }
        Log.m105925i("MicroMsg.MMSightCameraInfo", "preViewPoint: %s ", point2);
        dVar.f324535e = new Point(point2.x, point2.y);
        dVar.f324534d = new Point(point2.x, point2.y);
        dVar.f324536f = C97842b.m126289f(point3, point2, z2, true);
        Point point4 = new Point(point2.x, point2.y);
        dVar.f324531a = point4;
        dVar.f324532b = point2;
        dVar.f324533c = C97842b.m126289f(point3, point4, z2, true);
        Log.m105925i("MicroMsg.MMSightCameraInfo", "find bestPreviewSize  %s -> %s ", point4, point2);
        return dVar;
    }

    /* renamed from: d */
    public static C108387d m146830d(Camera.Parameters parameters, Point point, int i, int i2, boolean z) {
        int i3;
        Point point2 = point;
        int i4 = i;
        boolean z2 = z;
        ArrayList arrayList = new ArrayList(parameters.getSupportedPreviewSizes());
        Collections.sort(arrayList, new C108386c((C108384a) null));
        new ArrayList(parameters.getSupportedPictureSizes());
        Log.m105925i("MicroMsg.MMSightCameraInfo", "supportedPreviewSizes: %s", C97842b.m126305v(arrayList));
        int i5 = point2.x;
        int i6 = 5;
        Log.m105925i("MicroMsg.MMSightCameraInfo", "screen.x: %d, screen.y: %d, ratio: %f, upperBoundPrewView: %s lowerBoundPreView: %s", Integer.valueOf(i5), Integer.valueOf(point2.y), Float.valueOf(((float) i5) / ((float) point2.y)), Integer.valueOf(i), Integer.valueOf(i2));
        Log.m105919d("MicroMsg.MMSightCameraInfo", "systemAvailableMemInMB: %d", Long.valueOf(Util.getAvailableMemoryMB(MMApplicationContext.getContext())));
        C108387d dVar = new C108387d();
        Point a = m146826a(arrayList, point2, z2, i4);
        dVar.f324531a = a;
        if (a != null) {
            dVar.f324532b = C97842b.m126289f(point2, a, z2, false);
            dVar.f324533c = C97842b.m126289f(point2, dVar.f324531a, z2, true);
        } else {
            Point point3 = new Point();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Camera.Size size = (Camera.Size) it.next();
                int i7 = size.width;
                point3.x = i7;
                int i8 = size.height;
                point3.y = i8;
                if (i7 == i8) {
                    Log.m105925i("MicroMsg.MMSightCameraInfo", "exclude square curSize: %s", point3);
                } else {
                    Object[] objArr = new Object[i6];
                    objArr[0] = Integer.valueOf(i7);
                    objArr[1] = Integer.valueOf(point3.y);
                    objArr[2] = Boolean.valueOf(z);
                    objArr[3] = Integer.valueOf(point2.x);
                    objArr[4] = Integer.valueOf(point2.y);
                    Log.m105925i("MicroMsg.MMSightCameraInfo", "cursize is %s * %s , and isRotate %s, screenRes.x %s, screenRes.y %s", objArr);
                    if (point2.y > point2.x) {
                        if (point3.y >= point3.x) {
                            Log.m105925i("MicroMsg.MMSightCameraInfo", "screen ratio is differ from preview ratio  1 and unSupport preview is %s * %s", Integer.valueOf(size.height), Integer.valueOf(size.width));
                        }
                    } else if (point3.x >= point3.y) {
                        Log.m105925i("MicroMsg.MMSightCameraInfo", "screen ratio is differ from preview ratio 2 and unSupport preview is %s * %s", Integer.valueOf(size.height), Integer.valueOf(size.width));
                    }
                    Point f = C97842b.m126289f(point2, point3, z2, false);
                    if (f == null) {
                        Log.m105925i("MicroMsg.MMSightCameraInfo", "curSize: %s, can not find crop size", point3);
                    } else {
                        Log.m105925i("MicroMsg.MMSightCameraInfo", "preViewPoint: %s --> bestSize %s ", point3, f);
                        dVar.f324535e = new Point(f.x, f.y);
                        dVar.f324534d = new Point(point3.x, point3.y);
                        dVar.f324536f = C97842b.m126289f(point2, point3, z2, true);
                        if (Math.min(f.x, f.y) > i4) {
                            int i9 = i2;
                            i6 = 5;
                        } else if (Math.min(f.x, f.y) < i2) {
                            return null;
                        } else {
                            Point point4 = new Point(point3.x, point3.y);
                            dVar.f324531a = point4;
                            dVar.f324532b = f;
                            dVar.f324533c = C97842b.m126289f(point2, point4, z2, true);
                            Log.m105925i("MicroMsg.MMSightCameraInfo", "find bestPreviewSize  %s -> %s findcount %d", point4, f, 1);
                            i3 = 1;
                        }
                    }
                }
            }
            Log.m105925i("MicroMsg.MMSightCameraInfo", "final tryFindBestSize prewViewSize %s cropSize %s findcount %d", dVar.f324531a, dVar.f324532b, Integer.valueOf(i3));
            return dVar;
        }
        i3 = 0;
        Log.m105925i("MicroMsg.MMSightCameraInfo", "final tryFindBestSize prewViewSize %s cropSize %s findcount %d", dVar.f324531a, dVar.f324532b, Integer.valueOf(i3));
        return dVar;
    }

    /* renamed from: e */
    public static C108387d m146831e(Camera.Parameters parameters, Point point, int i, boolean z) {
        ArrayList arrayList = new ArrayList(parameters.getSupportedPreviewSizes());
        Collections.sort(arrayList, new C108386c((C108384a) null));
        Log.m105925i("MicroMsg.MMSightCameraInfo", "supportedPreviewSizes: %s", C97842b.m126305v(arrayList));
        int i2 = point.x;
        Log.m105925i("MicroMsg.MMSightCameraInfo", "screen.x: %d, screen.y: %d, ratio: %f, upperBoundPrewView: %s lowerBoundPreView: %s", Integer.valueOf(i2), Integer.valueOf(point.y), Float.valueOf(((float) i2) / ((float) point.y)), Integer.valueOf(i), 0);
        Log.m105919d("MicroMsg.MMSightCameraInfo", "systemAvailableMemInMB: %d", Long.valueOf(Util.getAvailableMemoryMB(MMApplicationContext.getContext())));
        C108387d dVar = new C108387d();
        Point point2 = new Point();
        int i3 = ((int) (((float) i) * 1.05f)) + 64;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                Log.m105925i("MicroMsg.MMSightCameraInfo", "final tryFindBestSize prewViewSize %s cropSize %s findcount %d with crop width", dVar.f324531a, dVar.f324532b, 0);
                break;
            }
            Camera.Size size = (Camera.Size) it.next();
            int i4 = size.height;
            if (i4 <= i3) {
                int i5 = size.width;
                point2.x = i5;
                point2.y = i4;
                Log.m105925i("MicroMsg.MMSightCameraInfo", "cursize is %s * %s , and isRotate %s, screenRes.x %s, screenRes.y %s", Integer.valueOf(i5), Integer.valueOf(point2.y), Boolean.valueOf(z), Integer.valueOf(point.x), Integer.valueOf(point.y));
                if (point.y > point.x) {
                    if (point2.y >= point2.x) {
                        Log.m105925i("MicroMsg.MMSightCameraInfo", "screen ratio is differ from preview ratio  1 and unSupport preview is %s * %s", Integer.valueOf(size.height), Integer.valueOf(size.width));
                    }
                } else if (point2.x >= point2.y) {
                    Log.m105925i("MicroMsg.MMSightCameraInfo", "screen ratio is differ from preview ratio 2 and unSupport preview is %s * %s", Integer.valueOf(size.height), Integer.valueOf(size.width));
                }
                Point f = C97842b.m126289f(point, point2, z, false);
                if (f != null) {
                    Log.m105925i("MicroMsg.MMSightCameraInfo", "preViewPoint: %s --> bestSize %s ", point2, f);
                    dVar.f324535e = new Point(f.x, f.y);
                    dVar.f324534d = new Point(point2.x, point2.y);
                    dVar.f324536f = C97842b.m126289f(point, point2, z, true);
                    Point point3 = new Point(point2.x, point2.y);
                    dVar.f324531a = point3;
                    dVar.f324532b = f;
                    dVar.f324533c = C97842b.m126289f(point, point3, z, true);
                    Log.m105925i("MicroMsg.MMSightCameraInfo", "find bestPreviewSize  %s -> %s findcount %d", point3, f, 1);
                    break;
                }
            }
        }
        return dVar;
    }

    /* renamed from: f */
    public static C108387d m146832f(Camera.Parameters parameters, Point point, int i, boolean z) {
        ArrayList arrayList = new ArrayList(parameters.getSupportedPreviewSizes());
        Collections.sort(arrayList, new C108386c((C108384a) null));
        new ArrayList(parameters.getSupportedPictureSizes());
        Log.m105925i("MicroMsg.MMSightCameraInfo", "tryFindPreviewSizeAnyWay supportedPreviewSizes: %s", C97842b.m126305v(arrayList));
        int i2 = point.x;
        Log.m105925i("MicroMsg.MMSightCameraInfo", "screen.x: %d, screen.y: %d, ratio: %f, upperBoundPrewView: %s", Integer.valueOf(i2), Integer.valueOf(point.y), Float.valueOf(((float) i2) / ((float) point.y)), Integer.valueOf(i));
        Log.m105919d("MicroMsg.MMSightCameraInfo", "systemAvailableMemInMB: %d", Long.valueOf(Util.getAvailableMemoryMB(MMApplicationContext.getContext())));
        C108387d dVar = new C108387d();
        Point a = m146826a(arrayList, point, z, i);
        dVar.f324531a = a;
        if (a == null) {
            Point point2 = new Point();
            Math.min(point.x, point.y);
            Math.max(point.x, point.y);
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Camera.Size size = (Camera.Size) it.next();
                int i3 = size.width;
                point2.x = i3;
                int i4 = size.height;
                point2.y = i4;
                if (i3 != i4 && Math.min(i3, i4) <= i && Math.max(point2.x, point2.y) <= 2000 && C97842b.m126288e(point, point2, z, false) != null) {
                    dVar.f324531a = null;
                    break;
                }
            }
        } else {
            dVar.f324532b = C97842b.m126288e(point, a, z, false);
            dVar.f324533c = C97842b.m126288e(point, dVar.f324531a, z, true);
        }
        Log.m105925i("MicroMsg.MMSightCameraInfo", "final tryFindBestSize prewViewSize %s cropSize %s findcount %d with any way", dVar.f324531a, dVar.f324532b, 0);
        return dVar;
    }

    /* renamed from: g */
    public static C108387d m146833g(Size[] sizeArr, Point point, int i, boolean z) {
        Arrays.sort(sizeArr, new C108385b((C108384a) null));
        Log.m105925i("MicroMsg.MMSightCameraInfo", "tryFindPreviewSizeAnyWay supportedPreviewSizes: %s", C97842b.m126304u(sizeArr));
        int i2 = point.x;
        Log.m105925i("MicroMsg.MMSightCameraInfo", "screen.x: %d, screen.y: %d, ratio: %f, upperBoundPrewView: %s", Integer.valueOf(i2), Integer.valueOf(point.y), Float.valueOf(((float) i2) / ((float) point.y)), Integer.valueOf(i));
        Log.m105919d("MicroMsg.MMSightCameraInfo", "systemAvailableMemInMB: %d", Long.valueOf(Util.getAvailableMemoryMB(MMApplicationContext.getContext())));
        C108387d dVar = new C108387d();
        Point b = m146827b(sizeArr, point, z, i);
        dVar.f324531a = b;
        if (b == null) {
            Point point2 = new Point();
            Math.min(point.x, point.y);
            Math.max(point.x, point.y);
            int length = sizeArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                Size size = sizeArr[i3];
                point2.x = size.getWidth();
                int height = size.getHeight();
                point2.y = height;
                int i4 = point2.x;
                if (i4 != height && Math.min(i4, height) <= i && Math.max(point2.x, point2.y) <= 2000 && C97842b.m126288e(point, point2, z, false) != null) {
                    dVar.f324531a = null;
                    break;
                }
                i3++;
            }
        } else {
            dVar.f324532b = C97842b.m126288e(point, b, z, false);
            dVar.f324533c = C97842b.m126288e(point, dVar.f324531a, z, true);
        }
        Log.m105925i("MicroMsg.MMSightCameraInfo", "final tryFindBestSize prewViewSize %s cropSize %s findcount %d with any way", dVar.f324531a, dVar.f324532b, 0);
        return dVar;
    }

    /* renamed from: h */
    public static C108387d m146834h(Size[] sizeArr, Point point, int i, boolean z) {
        Arrays.sort(sizeArr, new C108385b((C108384a) null));
        Log.m105925i("MicroMsg.MMSightCameraInfo", "tryFindPreviewSizeAnyWayV1 isRoate:%b,supportedPreviewSizes: %s", Boolean.valueOf(z), C97842b.m126304u(sizeArr));
        int i2 = point.x;
        Log.m105925i("MicroMsg.MMSightCameraInfo", "screen.x: %d, screen.y: %d, ratio: %f, upperBoundPrewView: %s", Integer.valueOf(i2), Integer.valueOf(point.y), Float.valueOf(((float) i2) / ((float) point.y)), Integer.valueOf(i));
        Log.m105919d("MicroMsg.MMSightCameraInfo", "systemAvailableMemInMB: %d", Long.valueOf(Util.getAvailableMemoryMB(MMApplicationContext.getContext())));
        C108387d dVar = new C108387d();
        Point b = m146827b(sizeArr, point, z, i);
        dVar.f324531a = b;
        if (b == null) {
            Point point2 = new Point();
            Math.min(point.x, point.y);
            Math.max(point.x, point.y);
            int length = sizeArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                Size size = sizeArr[i3];
                point2.x = size.getWidth();
                int height = size.getHeight();
                point2.y = height;
                int i4 = point2.x;
                if (i4 != height && Math.min(i4, height) <= i && Math.max(point2.x, point2.y) <= 2000 && C97842b.m126288e(point, point2, z, false) != null) {
                    dVar.f324531a = point2;
                    break;
                }
                i3++;
            }
        } else {
            dVar.f324532b = C97842b.m126288e(point, b, z, false);
            dVar.f324533c = C97842b.m126288e(point, dVar.f324531a, z, true);
        }
        Log.m105925i("MicroMsg.MMSightCameraInfo", "final tryFindPreviewSizeAnyWayV1 prewViewSize %s cropSize %s findcount %d with any way", dVar.f324531a, dVar.f324532b, 0);
        return dVar;
    }

    /* renamed from: b */
    public static C108387d m146828b(Size[] sizeArr, Point point, int i, boolean z) {
        Point point2 = null;
        Arrays.sort(sizeArr, new C108385b((C108384a) null));
        Log.m105925i("MicroMsg.MMSightCameraInfo", "findPreviewSizeWithoutCrop supportedPreviewSizes: %s", C97842b.m126304u(sizeArr));
        int i2 = point.x;
        Log.m105925i("MicroMsg.MMSightCameraInfo", "screen.x: %d, screen.y: %d, ratio: %f, upperBoundPrewView: %s ", Integer.valueOf(i2), Integer.valueOf(point.y), Float.valueOf(((float) i2) / ((float) point.y)), Integer.valueOf(i));
        Log.m105919d("MicroMsg.MMSightCameraInfo", "systemAvailableMemInMB: %d", Long.valueOf(Util.getAvailableMemoryMB(MMApplicationContext.getContext())));
        C108387d dVar = new C108387d();
        int i3 = ((int) (((float) i) * 1.05f)) + 64;
        int length = sizeArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Size size = sizeArr[i4];
            if (size.getHeight() <= i3 && size.getWidth() <= 2000) {
                point2 = new Point();
                point2.x = size.getWidth();
                point2.y = size.getHeight();
                break;
            }
            i4++;
        }
        Log.m105925i("MicroMsg.MMSightCameraInfo", "preViewPoint: %s ", point2);
        dVar.f324535e = new Point(point2.x, point2.y);
        dVar.f324534d = new Point(point2.x, point2.y);
        dVar.f324536f = C97842b.m126289f(point, point2, z, true);
        Point point3 = new Point(point2.x, point2.y);
        dVar.f324531a = point3;
        dVar.f324532b = point2;
        dVar.f324533c = C97842b.m126289f(point, point3, z, true);
        Log.m105925i("MicroMsg.MMSightCameraInfo", "find bestPreviewSize  %s -> %s ", point3, point2);
        return dVar;
    }
}
