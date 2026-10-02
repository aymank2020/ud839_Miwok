# مراجعة ud839_Miwok وخطة التطوير

<!-- review-metadata -->
تاريخ المراجعة: 2026-10-02. الفرع المحلي: `codex/review-develop-2026-10-02`.

المصدر: [aymank2020/ud839_Miwok](https://github.com/aymank2020/ud839_Miwok)؛ commit الأساس: `1348b343caa5db00670d417e3639b85a1cbcb746`؛ عدد الملفات المتتبعة في الأساس: 35. Fork: true؛ مؤرشف: false.

نُفذت المرحلة المحددة أدناه بعد مراجعة الكود والاختبارات وتطبيق مراجعة التكامل والأثر؛ المراحل التالية والفجوات لا تُعد مكتملة.

فرع من تطبيق Udacity التعليمي بترخيص Apache2.0. الإصدار الموجود يحتوي شاشة رئيسية وأربع Activities للفئات، لكن صفحات الفئات كانت فارغة. البنية قديمة: AGP2.1 وAndroid23 وBuild-Tools27.0.3؛ لم تُستبدل المادة التعليمية بمنتج جديد.

## التنفيذ الحالي

رُبطت الأرقام والعائلة والألوان والعبارات بـListView وWordAdapter يعرضان الإنجليزية وترجمة Miwok. استُعيدت 38 زوجًا من فرع lesson-two الرسمي: 10 أرقام،10 أفراد عائلة،8 ألوان،10 عبارات، مع نسب المصدر والترخيص في الموارد. يتحقق adapter من تساوي طول مصفوفتَي اللغة. أُضيف Google/Maven Central إلى مستودعات البناء القديمة.

## خطة المراحل التالية

1. تشغيل الدرس الحالي على بيئة Android متوافقة؛ إصلاح البناء أولًا قبل تغييرات التصميم أو الاعتماديات الكبيرة.
2. استكمال الصور والصوت من مراحل الدرس الرسمية مع إدارة MediaPlayer ودورة حياته وتوثيق حقوق الوسائط.
3. نقل المشروع تدريجيًا إلى AndroidX وAGP حديث مع اختبار فتح الفئات الأربع والتمرير ووضوح النص.

## التكامل والتحقق

المسار: أزرار MainActivity → Activities الأربع → الموارد vocabulary → WordAdapter → صفوف ListView. المستخدم يصل إلى مفردات الفئة بدل شاشة فارغة. تحليل XML تحقق من صحة الموارد ومن 38 زوجًا متساويًا، ومراجعة المصدر تحققت من ربط الفئات الأربع بالعرض والموارد. لم يُبنَ APK لهذا المشروع؛ أوقفت تنزيلات/بناء Android الإضافية عند امتلاء قرص العمل. لا يدّعي فحص البيانات وحده نجاح تشغيل التطبيق. التخطيطات الفارغة القديمة باقية كآثار للدرس، ولا تستهلكها Activities المعدلة.

## مصادر أولية

- [Udacity: الأرقام، lesson-two](https://github.com/udacity/ud839_Miwok/blob/lesson-two/app/src/main/java/com/example/android/miwok/NumbersActivity.java)
- [Udacity: العائلة](https://github.com/udacity/ud839_Miwok/blob/lesson-two/app/src/main/java/com/example/android/miwok/FamilyActivity.java)
- [Udacity: الألوان](https://github.com/udacity/ud839_Miwok/blob/lesson-two/app/src/main/java/com/example/android/miwok/ColorsActivity.java)
- [Udacity: العبارات](https://github.com/udacity/ud839_Miwok/blob/lesson-two/app/src/main/java/com/example/android/miwok/PhrasesActivity.java)
