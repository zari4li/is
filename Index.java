package pack; /*Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов. 
pack - название пакета */

import java.awt.*;
import java.awt.event.*;
/*	java. - Все стандартные классы, поставляемые с системой Java, хранятся в пакете java.
java.awt  - подключение пакета awt, содержащего базовые графические функции:GridLayout, BorderLayout и т.д.
"*"-включение всех элементов библиотеки awt */	
import javax.swing.*;
/*	Импортируем: 
javax.* — стандартные расширения.(Стандартные расширения (standard extensions) — это пакеты или наборы пакетов Java)
Swing - Библиотека графического интерфейса (конкретный пакет), В отличие от java.awt, javax.swing имеет более гибкую 
систему управления и более широкий набор функций
"*"-включение всех элементов библиотеки Swing (jbutton,jpanel,jlabel и т.д.)
"."(точка) используется для выделения элементов из ссылки на объект.
*/
import javax.swing.border.*;//библиотека необходимая для того, чтобы установить отступы

public class Index extends JFrame{
	/*	(Public) - поля и методы класса Index доступны для всех других объектов и классов. 
	зарезервированное слово class - говорит транслятору, что мы собираемся описать новый класс Index.
	Класс наследует функции элемента JFrame, который определён в стандартной библиотеке awt.
	 JFrame - само окно. JFrame содержит в себе всё необходимое для создания и функционирования окна программы - мы 
	 используем его методы в своей программе. { }-описание класса располагается между фигурными скобками. 
	*/
	
	private static final long serialVersionUID = 1L;
	public static Index Index_frame = new Index(); /* Index() - это установка компонентов (панель вкладок) на JFrame. 
	(Public) - означает что фрейм Index можно вызвать из любого файла который лежит в пакете pack.
	static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
	и переменным можно обращаться через имя класса*/
	
	public static void main(String[] args) { /*  
		Модификатор доступа public означает, что метод main(String[] args)виден и доступен любому классу. 
		static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
		отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
		и переменным можно обращаться через имя класса.
		void означает, что метод main(String[] args)не возвращает данных в программу, которая его вызвала, 
		а просто выводит на экран строку.
		В методе main слова String[] args означают,что этот может получать массив объектов с типом String, т.е. текстовые данные.
		Программа может состоять из нескольких классов, но только один из них содержит метод main().
		Все существующие реализации Java-интерпретаторов, получив команду интерпретировать класс, 
		начинают свою работу с вызова метода main. 
		*/
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				/* public - модификатор доступа, означающий, что метод run() виден и доступен любому классу.
				void ()означает, что метод run не возвращает данных в программу, которая его вызвала, 
				а просто выводит на экран строку.
				Метод run с пустыми скобками, т.е. метод не имеет аргументов(параметров)	 
				*/
				try {
		/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
		Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
		Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
		1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
		доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
		 прерывается, и управление прыгает в начало блока catch(err).
		*/
					Index_frame.setVisible(true); //устанавливаем что окно Index (Расчет расхода топлива) видно пользователю

				} catch (Exception e) {
					e.printStackTrace();
					/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
					Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
					Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
					1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
					доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
					 прерывается, и управление прыгает в начало блока catch(err).
					*/
				}
			}
		});
	}
	
	
	private JPanel Smeta_panel, Smeta_panel_1, Button_panel;//панели на которых располагаются поля и кнопки. Панели доступны только для данного класса (private)
	private JButton Sost_smetu;// кнопка Рассчитать которая доступна только для данного класса
	private JLabel Smeta_1,Smeta_2,Smeta_3,Smeta_4, Smeta_5, Smeta_6, Smeta_7, Smeta_8, Smeta_9, Smeta_10, Smeta_11, 
	Smeta_12, Smeta_13, Smeta_14, Smeta_15,Smeta_16,Smeta_pust; // Панели на которых располагается текст
	public static JTextField Kol_prod_text, Stoim_mater_text, Stoim_kompl_text, Stoim_vspom_mater_text, 
	Toplivo_text, Zaprl_text, Stoim_stanka_text, Srok_sl_text, Amort_text, Pr_rash_text, Kol_detal_text;/* текстовые поля в которые пользователь 
	вводит данные, доступны для любого файла из пакета pack */
	public static JCheckBox Ras_amort_checkbox;// компонент флажок
	public static JComboBox Name_combobox;//выпадающий список
	public static int Name_int, Name_combo_int,Ras_amort_int=0, ver=0;//переменная типа integer, доступная любому классу
		/*static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
	и переменным можно обращаться через имя класса.*/
	
	
	public Index() { /*Модификатор доступа public означает, что метод Index()виден и доступен любому классу.
		static означает, что не нужно создавать экземпляр(копию) объекта Index в памяти, чтобы использовать этот метод.
		Index - расположение на фрейме компонентов (панель вкладок), .*/
		setTitle("Составление сметы"); //устанавливает название окна 
		setSize(540, 540); // указывает ширину (500) и высоту (540).
		setLocationRelativeTo(null);//установить посередине экрана
		setResizable(false); //запрет на расширение окна 
		
		//по закрытию формы - закрывать приложение
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout (new BorderLayout()); /*	Оператор new создает экземпляр указанного класса
	  	Метод setLayout - Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере.
 		Менеджер размещения BorderLayout - тип разбивки контейнера, при котором всё пространство контейнера разбивается 
 		на пять частей. В каждой из этих частей располагается один компонент. 
 		При добавлении компонента на контейнер с BorderLayout разработчик обязательно указывает, 
 		куда именно он хочет поместить компонент.*/

        Smeta_panel = new JPanel();//Панель на которой  располагаются текстовые поля и поля для ввода текста
		Smeta_panel_1 = new JPanel(); //Панель на которой располагаются текстовые поля и поля для ввода текста
		Button_panel = new JPanel();//Панель на которой располагается кнопка

		add(Smeta_panel, BorderLayout.NORTH);//Добавление панели Panel_Text наверх
		add(Smeta_panel_1, BorderLayout.CENTER);//Добавление панели Panel_Text по центру
		add(Button_panel, BorderLayout.SOUTH);//Добавление панели Panel_Button снизу

		Smeta_panel.setBorder(new EmptyBorder(5,10,5,10));//установка внутренних отступов(5 справа и слева,10сверху и снизу)
		Smeta_panel_1.setBorder(new EmptyBorder(5,10,5,10));//установка внутренних отступов

		/* установка менеджера компоновки GridLayout. данный менеджер компоновки располагает компоненты в таблицу */
		Smeta_panel.setLayout(new GridLayout(2,1,0,15));//на панели 2 строки,1столбец ("данные для.." и "пожалуйста,..")
		Smeta_panel_1.setLayout(new GridLayout(14,2,0,5));/* на панеле будет 14 строк, 2 столбца, расстояние между
		 столбцами 0, расстояние между строками 5 */
		Button_panel.setLayout(new GridLayout(1,1));//на панели 1 строка,1столбец, будет расположена кнопка

		Smeta_1 = new JLabel("Данные для составления сметы затрат", JLabel.CENTER);
		Smeta_2 = new JLabel("Пожалуйста, введите затраты за месяц:", JLabel.LEFT);
		Smeta_3 = new JLabel("Наименование изделия:", JLabel.LEFT);
		Smeta_4 = new JLabel("Количество произведенной продукции, шт: ", JLabel.LEFT);
		Smeta_5 = new JLabel("1. Материальные затраты:", JLabel.LEFT);
		Smeta_6 = new JLabel("     1.1. Сырье и материалы, руб:", JLabel.LEFT);
		Smeta_7 = new JLabel("     1.2. Комплектующие изделия, руб:", JLabel.LEFT);
		Smeta_8 = new JLabel("     1.3. Вспомогательные материалы, руб:", JLabel.LEFT);
		Smeta_9 = new JLabel("     1.4. Топливо и энергия, руб:", JLabel.LEFT);
		Smeta_10 = new JLabel("2. Затраты на оплату труда, руб:", JLabel.LEFT);
		Smeta_11 = new JLabel("3. Рассчитать амортизацию?", JLabel.LEFT);
		Smeta_12 = new JLabel("     3.1.1. Стоимость станка, руб:", JLabel.LEFT);
		Smeta_13 = new JLabel("     3.1.2. Срок службы станка, в месяцах:", JLabel.LEFT);
		Smeta_14 = new JLabel("     3.2. Вычет амортизации, руб:", JLabel.LEFT);
		Smeta_15 = new JLabel("4. Прочие расходы, руб:", JLabel.LEFT);
		Smeta_16 = new JLabel("Количество изделий, шт:", JLabel.LEFT);

		Smeta_pust=new JLabel("");//для отображения отступа между полями для ввода текста количество продукции и сырье и материалы
		/*Обозначаем что переменные Label_1,Label_2..являются объектом JLabel и указываем какой текст будет выводиться.
		JLabel.LEFT - выравнивание по левому краю,
		JLabel.CENTER - выравнивание по центру
		*/
		
		Sost_smetu = new JButton("Составить смету"); //В скобках - надпись на кнопке
		
		Ras_amort_checkbox = new JCheckBox();//компонент флажок 
		Ras_amort_checkbox.setToolTipText("Амортизация известна или нужно рассчитать?");
		/* setToolTipText - подсказка, которая показывается при наведении на элемент (компонент флажок)*/
		
		Kol_prod_text = new JTextField();
		Kol_prod_text.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		Kol_prod_text.setToolTipText("Введите количество произведенной продукции");//всплывающая подсказка при наведении на текстовое поле
    	
		Stoim_mater_text = new JTextField();
		Stoim_mater_text.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		Stoim_mater_text.setToolTipText("Введите стоимость сырья и материалов");//всплывающая подсказка при наведении на текстовое поле
    			
		Stoim_kompl_text = new JTextField();
		Stoim_kompl_text.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		Stoim_kompl_text.setToolTipText("Введите стоимость комплектующих изделий");//всплывающая подсказка при наведении на текстовое поле

		Stoim_vspom_mater_text = new JTextField();
		Stoim_vspom_mater_text.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		Stoim_vspom_mater_text.setToolTipText("Введите стоимость вспомогательных материалов");//всплывающая подсказка при наведении на текстовое поле

		Toplivo_text = new JTextField();
		Toplivo_text.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		Toplivo_text.setToolTipText("Введите расходы на топливо и энергию");//всплывающая подсказка при наведении на текстовое поле

		Zaprl_text = new JTextField();
		Zaprl_text.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		Zaprl_text.setToolTipText("Введите затраты на оплату труда");//всплывающая подсказка при наведении на текстовое поле

		Stoim_stanka_text = new JTextField();
		Stoim_stanka_text.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		Stoim_stanka_text.setToolTipText("Введите стоимость станка");//всплывающая подсказка при наведении на текстовое поле

		Srok_sl_text = new JTextField();
		Srok_sl_text.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		Srok_sl_text.setToolTipText("Введите срок службы станка");//всплывающая подсказка при наведении на текстовое поле

		Amort_text = new JTextField();
		Amort_text.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		Amort_text.setToolTipText("Введите вычет амортизации, если он известен. Если нет - нажмите на Рассчитать амортизацию");//всплывающая подсказка при наведении на текстовое поле

		Pr_rash_text = new JTextField();
		Pr_rash_text.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		Pr_rash_text.setToolTipText("Введите прочие расходы");//всплывающая подсказка при наведении на текстовое поле

		Kol_detal_text = new JTextField();
		Kol_detal_text.setMargin(new Insets(2, 5, 2, 5));//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)		
		Kol_detal_text.setToolTipText("Введите количество изделий на которые надо составит смету");//всплывающая подсказка при наведении на текстовое поле

    	String[] str = {
				"столы",
  			    "стулья",
  			    "шкафы",
  			    "кровати","тумбы"
  			};
		/*	String[] str – класс с оператором приема строки
	  	В строке ниже мы будем использовать данный оператор для передачи строки в выпадающий список
	 	*/
		Name_combobox = new JComboBox(str);   
		/*	JComboBox - Поле с выпадающим списком
	   	Создаем переменную Box_st И присваиваем ей функции класса JComboBox
	   	Оператор new создает экземпляр указанного класса
	   	JComboBox(str) значит что мы в качестве строк
	   	выпадающего списка принимаем считанные строки параметром str
	 	*/
        
        
		Button_panel.add(Sost_smetu);//Добавление кнопки на панель Button_panel
		
		//Добавление компонентов JLabel, JTextField, JComboBox, JCheckBox на панели Smeta_panel и Smeta_panel_1
		Smeta_panel.add(Smeta_1);
		Smeta_panel.add(Smeta_2);

		Smeta_panel_1.add(Smeta_3);
		Smeta_panel_1.add(Name_combobox);
		Smeta_panel_1.add(Smeta_4);
		Smeta_panel_1.add(Kol_prod_text);
		Smeta_panel_1.add(Smeta_5);
		Smeta_panel_1.add(Smeta_pust);
		Smeta_panel_1.add(Smeta_6);
		Smeta_panel_1.add(Stoim_mater_text);
		Smeta_panel_1.add(Smeta_7);
		Smeta_panel_1.add(Stoim_kompl_text);	
		Smeta_panel_1.add(Smeta_8);
		Smeta_panel_1.add(Stoim_vspom_mater_text);	
		Smeta_panel_1.add(Smeta_9);
		Smeta_panel_1.add(Toplivo_text);	
		Smeta_panel_1.add(Smeta_10);
		Smeta_panel_1.add(Zaprl_text);
		Smeta_panel_1.add(Smeta_11);
		Smeta_panel_1.add(Ras_amort_checkbox);
		Smeta_panel_1.add(Smeta_12);
		Smeta_panel_1.add(Stoim_stanka_text);
		Smeta_panel_1.add(Smeta_13);
		Smeta_panel_1.add(Srok_sl_text);
		Smeta_panel_1.add(Smeta_14);
		Smeta_panel_1.add(Amort_text);
		Smeta_panel_1.add(Smeta_15);
		Smeta_panel_1.add(Pr_rash_text);
		Smeta_panel_1.add(Smeta_16);
		Smeta_panel_1.add(Kol_detal_text);		
		//Добавление компонентов JLabel, JTextField, JComboBox, JCheckBox на панели Smeta_panel и Smeta_panel_1
		
		//поля для расчета амортизации недоступны
		Stoim_stanka_text.setEditable(false);
		Srok_sl_text.setEditable(false);
		
		Ras_amort_checkbox.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==Ras_amort_checkbox)//если событие произошло именно с флажком Ras_amort_checkbox, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то это означает что выбрано
					что нужно рассчитать амортизацию  */
						Amort_text.setEditable(false); //поле для ввода амортизации становится недоступно 
						Stoim_stanka_text.setEditable(true); 
						Srok_sl_text.setEditable(true);
						/*поля для ввода стоимости станка и срока службы станка 
						становятся доступными*/
						Ras_amort_int=1; //переменная которая отвечает за то нужно ли рассчитывать амортизацию,=1 - нужно
						}
					else { //если флажок выключен, то значит амортизацию рассчитывать не нужно
						Amort_text.setEditable(true);//поле для ввода амортизации становится доступным 
						Stoim_stanka_text.setEditable(false);
						Srok_sl_text.setEditable(false);
						/*поля для ввода стоимости станка и срока службы станка 
						становятся недоступными*/
						Ras_amort_int=0;//переменная которая отвечает за то нужно ли рассчитывать амортизацию,=0 - не нужно
					}
			}                                                       
    	   }); 	
		
		
		Sost_smetu.addActionListener(new ActionListener()   
    			/* 	Sost_smetu - кнопка Составить смету
    	 		"."  - указывает к какой переменной (кнопке) следует применить слушателя.
    	 		addActionListener - добавление слушателя ActionListener к кнопке
    	  		new - Оператор new создает экземпляр указанного класса 
    	  		(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
    	  		который будет отвечать за реагирование на события. 
    	  		В нашем случае требуется идентифицировать событие нажатия кнопки – путем щелчка мышью. 
    	  		Поэтому будет использоваться интерфейс "ActionListener", 
    	  		предназначенный для обработки событий "ActionEvent".
    	  		тело интерфейса указывается ниже после фигурной скобки "{"
    	  		*/ 
    	   {                                                         
    	    public void actionPerformed(ActionEvent e)   
    	    /* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
      		который реализуется путем простого вызова обработчика событий ActionPerformed.
      		Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
      		Ключевое слово void означает, что метод main() не возвращает данных в программу, которая его вызвала. 
      	*/
    	    {  
    	    	Name_combo_int=Name_combobox.getSelectedIndex();
    	    	Name_int=Name_combobox.getSelectedIndex();
        	/* 	
    	  	getSelectedIndex() преобразует выбранный вариант в порядковой номер последовательности StBox 
    	  	*/      
    	    	if ((isValidInput(Kol_prod_text, "количество произведенной продукции")) && 
    	    		(isValidInput(Stoim_mater_text, "стоимость материалов")) && 
    	    		(isValidInput(Stoim_kompl_text, "стоимость комплектующих изделий"))&& 
    	    		(isValidInput(Stoim_vspom_mater_text, "стоимость вспомогательных материалов"))&& 
    	    		(isValidInput(Toplivo_text, "стоимость топлива и энергии"))&& 
    	    		(isValidInput(Zaprl_text, "расходы на оплату труда"))&& 
    	    		(isValidInput(Pr_rash_text, "прочие расходы")))
    	    		/* if - оператор если. * isValidInput проверяет данные на правильность, т.е. 
    		 		если в текстовые поля введены буквы или символы (текст, который невозможно преобразовать в цифры).
    		   		Если введены некорректные данные, то выдает ошибку */	
    	    		{
    	    		if (Ras_amort_int==0){ //нужно рассчитывать амортизацию или нет, =0 - не нужно
    	    			if (isValidInput(Amort_text, "вычет амортизации")) {ver=1;} else {ver=0;};
    	    			/* проверка правильно ли ввели данные в поле вычет амортизации*/
    	    		} else {
    	    			if (isValidInput(Stoim_stanka_text, "стоимость станка") &&
    	    			isValidInput(Srok_sl_text, "срок службы станка")) {ver=1;} else {ver=0;};	
    	    			/*проверка правильно ли ввели данные в поле стоимость станка и срок службы станка */
    	    		}
    	    		if (ver==1){
    	    		Calculation.Smeta_gettext(); /* Обращаемся в класс Rash к методу RacBolDanPer 	*/
        	    	Index_frame.setVisible(false);//Окно становится невидимым
    	    		Smeta.main(null);
    	    		/* 	что будет происходить при нажатии на кнопку 
    				(открывается новая оконная форма класса Interface_Bolnic - Расчет больничного) 
    				программа передает в метод main класса Interface_Bolnic null. 
    				Тем самым происходит запуск метода без передачи переменных 
    				*/

    	    		}
    	    	} 
    	     }                                                        
    	   });  

	
	
	
	}
	
	//проверка данных, введенных пользователем
    public static boolean isValidInput(JTextField jtxt, String description) {

        JDialog D = new JDialog();
		//если был введен какой-либо текст
        if (jtxt.getText().trim().length() > 0) {
            //проверка на ввод только целого числа
            try { /* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
				Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
				Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
				1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
				доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
				 прерывается, и управление прыгает в начало блока catch(err).
				*/
              
                 double num = Double.parseDouble(jtxt.getText()); //попытка преобразовать текст в целое число      
                return true; //если все нормально - возвращаем true

            } catch (NumberFormatException e) {
            	/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
				Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
				Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
				1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
				доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
				 прерывается, и управление прыгает в начало блока catch(err).
				*/

                //предупреждение - неверный формат числа
                JOptionPane.showMessageDialog(D, "Вы должны ввести целое число!", "Ошибка", JOptionPane.WARNING_MESSAGE);

                //расположить курсор в текстовое поле, чтобы пользователь еще раз ввел число
                jtxt.requestFocus();
                jtxt.setText("");//очистить текстовое поле

                return false;//ошибка - возвращаем false
            }

        } else {// если пользователь не ввели никаких данных

            //предупреждение, что нужно ввести данные
            JOptionPane.showMessageDialog(D, "Введите " + description, "Ошибка", JOptionPane.WARNING_MESSAGE);

            //расположить курсор в текстово окне, чтобы пользователь еще раз ввел число
            jtxt.requestFocus();
            jtxt.selectAll();//очистить текстовое поле

            //ошибка - возвращаем false
            return false;
        }
    }	

}


2. Файл Calculation.java
package pack;

public class Calculation {
	static double Amort, Stoim_stanka, Srok_sl, Kol_prod, Stoim_mater, Stoim_kompl, Stoim_vspom_mater, Toplivo, Zaprl,
	Pr_rash, Kol_detal, Mat_zatr, Stoim_mater_1, Stoim_kompl_1, Stoim_vspom_mater_1, Toplivo_1, Otch, Pens, Medic, 
	Soc_strah, Zaprl_1, Amort_1, Pr_rash_1, Itogo;
	static String Name;
	/* Переменные типа double - с плавающей точкой. служат для представления чисел, имеющих дробную часть */
	/*static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
	и переменным можно обращаться через имя класса.*/

	public static void Smeta_gettext() {/*Класс Smeta_gettext, который доступен для любого файла из пакета pack */
		/*  Модификатор доступа public означает, что метод виден и доступен любому классу.
	    static означает, что не нужно создавать экземпляр(копию) объекта в памяти, чтобы использовать этот метод.
	    void означает, что метод не возвращает данных в программу, которая его вызвала.
	    Метод с пустыми скобками, это означает, что метод не имеет аргументов(параметров)
	    */
		if (Index.Ras_amort_int==0){ //если флажок Рассчитать был выключен
			Amort = Double.parseDouble(Index.Amort_text.getText());/* В переменную записываются данные введеные 
			пользователем в текстовое поле которое расположено в файле Index. Преобразование данных в тип Double. */
		} else {
			Stoim_stanka = Double.parseDouble(Index.Stoim_stanka_text.getText());
			Srok_sl = Double.parseDouble(Index.Srok_sl_text.getText());
		}
		Kol_prod = Double.parseDouble(Index.Kol_prod_text.getText());
		Stoim_mater = Double.parseDouble(Index.Stoim_mater_text.getText());	
		Stoim_kompl = Double.parseDouble(Index.Stoim_kompl_text.getText());	
		Stoim_vspom_mater = Double.parseDouble(Index.Stoim_vspom_mater_text.getText());	
		Toplivo = Double.parseDouble(Index.Toplivo_text.getText());	
		Zaprl = Double.parseDouble(Index.Zaprl_text.getText());	
		Pr_rash = Double.parseDouble(Index.Pr_rash_text.getText());	
		Kol_detal = Double.parseDouble(Index.Kol_detal_text.getText());	
		/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено в файле Index.
		Преобразование данных в тип Double. */
		
		if (Index.Name_int==0) {Name="столы";} //Name_int-переменная которая отвечает за выпадающий список.
		else if (Index.Name_int==1) {Name="стулья";} 
		else if (Index.Name_int==2) {Name="шкафы";}
		else if (Index.Name_int==2) {Name="кровати";} 
		else {Name="тумбы";} 
		
	}

	public static void Smeta_sost() {/*Класс, который доступен для любого файла из пакета pack */
		/*  Модификатор доступа public означает, что метод виден и доступен любому классу.
	    static означает, что не нужно создавать экземпляр(копию) объекта в памяти, чтобы использовать этот метод.
	    void означает, что метод не возвращает данных в программу, которая его вызвала.
	    Метод с пустыми скобками, это означает, что метод не имеет аргументов(параметров)
	    */
		
		/*стоимость материалов, комплектующих, вспомогательных материалов, расходы на топливо на определенное число
		 * изделий считаются как стоимость материалов,комплектующих.. за месяц разделенное на количество изделий,
		 * изготовленных за месяц и умноженное на определенное число изделий, на которые составляется смета */
		Stoim_mater_1=Stoim_mater/Kol_prod*Kol_detal; 
		Stoim_kompl_1=Stoim_kompl/Kol_prod*Kol_detal;
		Stoim_vspom_mater_1=Stoim_vspom_mater/Kol_prod*Kol_detal;
		Toplivo_1=Toplivo/Kol_prod*Kol_detal;
		Mat_zatr=Stoim_mater_1+Stoim_kompl_1+Stoim_vspom_mater_1+Toplivo_1;
		/* материальные затраты считаются как сумма стоимости материалов, комплектующих, вспомогательных материалов,
		 *  расходы на топливо */
		
		/*затраты на оплату труда на определенное количество изделий рассчитываются как затраты труда за месяц 
		 * разделенное на количество изделий, изготовленных за месяц и умноженное на определенное число изделий,
		 *  на которые составляется смета */
		Zaprl_1=Zaprl/Kol_prod*Kol_detal;
		
		/*Отчисления в пенсионный фонд составляют 22% от затратов на оплату труда, мед.обслуж - 5,1%, соц.страх - 2,9%.
		 * Отчисления - сумма всех отчислений (в пенс.фонд,мед.обслуж,соц.страх) */
		
		Pens=Zaprl_1*0.22;
		Medic=Zaprl_1*0.051;
		Soc_strah=Zaprl_1*0.029;
		Otch=Pens+Medic+Soc_strah;
		
		/* Если пользователь нажал на флажок Рассчитать амортизацию, то амортизация за месяц рассчитается по формуле: 
		  Стоимость станка разделить на срок службы станка */
		if (Index.Ras_amort_int==0){ //если флажок Рассчитать был выключен
			Amort_1=Amort/Kol_prod;
		} else {
			Amort_1=Stoim_stanka/Srok_sl/Kol_prod;
		}
		
		/*прочие расходы на определенное количество изделий рассчитываются как прочие расхооды за месяц 
		 * разделенное на количество изделий, изготовленных за месяц и умноженное на определенное число изделий,
		 *  на которые составляется смета */
		Pr_rash_1=Pr_rash/Kol_prod*Kol_detal;
		
		/* Итого - сумма всех статей затрат */
		Itogo=Mat_zatr+Zaprl_1+Amort_1+Pr_rash_1;
		
		//форматированный вывод
	    String Kol_detal_str = String.format("%.2f", Kol_detal);
	    String Stoim_mater_str = String.format("%.2f", Stoim_mater_1);
	    String Stoim_kompl_str = String.format("%.2f", Stoim_kompl_1);
	    String Stoim_vspom_mater_str = String.format("%.2f", Stoim_vspom_mater_1);
	    String Toplivo_str = String.format("%.2f", Toplivo_1);
	    String Mat_zatr_str = String.format("%.2f", Mat_zatr);
	    String Zaprl_str = String.format("%.2f", Zaprl_1);
	    String Pens_str = String.format("%.2f", Pens);
	    String Medic_str = String.format("%.2f", Medic);
	    String Soc_strah_str = String.format("%.2f", Soc_strah);
	    String Otch_str = String.format("%.2f", Otch);
	    String Amort_str = String.format("%.2f", Amort_1);
	    String Pr_rash_str = String.format("%.2f", Pr_rash_1);
	    String Itogo_str = String.format("%.2f", Itogo);

	    /* String - указываем что переменная будет иметь строковый тип,
	     * String_sred_100km_1 - название новой переменной,
	     * String.format - преобразование переменной в строкой тип,
	     	%.2f - указываем что переменная будет отображать только 2 цифры после запятой,
	     	double_sred_100km - переменная типа double, которую надо преобразовать в строковый тип
	     	 */
		
	    Smeta.Name_label.setText(Name);
	    Smeta.Kol_prod_label.setText(Kol_detal_str);
	    Smeta.Mat_zatr_label.setText(Mat_zatr_str);
	    Smeta.Stoim_mater_label.setText(Stoim_mater_str);
	    Smeta.Stoim_kompl_label.setText(Stoim_kompl_str);
	    Smeta.Stoim_vspom_mater_label.setText(Stoim_vspom_mater_str);
	    Smeta.Toplivo_label.setText(Toplivo_str);
	    Smeta.Zaprl_label.setText(Zaprl_str);
	    Smeta.Otch_label.setText(Otch_str);
	    Smeta.Pens_label.setText(Pens_str);
	    Smeta.Medic_label.setText(Medic_str);
	    Smeta.Soc_strah_label.setText(Soc_strah_str);
	    Smeta.Amort_label.setText(Amort_str);
	    Smeta.Pr_rash_label.setText(Pr_rash_str);
	    Smeta.Itogo_label.setText(Itogo_str);    
	    /* Записываем строковые переменные в текстовые поля Name.., которые расположены в файле Smeta */
		
	}	
}
