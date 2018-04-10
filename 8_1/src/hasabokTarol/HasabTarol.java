package hasabokTarol;

import hasab.*;

public class HasabTarol {

		private Hasab[] hasabArray;
		
		public HasabTarol(int size){
			this.hasabArray=new Hasab[size];
		}
		
		public void setHasabRef(int index, Hasab h){
			this.hasabArray[index]=h;
		}
	
		public int getArraySize(){
			return this.hasabArray
		}
		
	}


