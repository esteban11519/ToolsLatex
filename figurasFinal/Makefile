MAIN=Start
MAIN_JAVA=$(MAIN).java
MAIN_CLASS=$(MAIN).class
JAVA_FILES=$(wildcard ./Data/*.java)

FIGURE_NAMES=figureNames.txt
FIGURES=figures.txt
# @ don't show the command

$(FIGURES) : $(FIGURE_NAMES) $(MAIN_CLASS)
	@java $(MAIN)

# Compile
$(MAIN_CLASS) : $(MAIN_JAVA) $(JAVA_FILES)
	javac -Xlint $<

# run
.PHONY : run
run :  
	java $(MAIN)


.PHONY : compile_and_run
compile_and_run:
	javac -Xlint $(MAIN_JAVA)
	java $(MAIN)

.PHONY : clean
clean :
	rm -f ./*.class
	rm -f ./Data/*.class
