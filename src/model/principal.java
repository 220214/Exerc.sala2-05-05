package model;

import br.mari.listaInt.Lista;

public class principal {

	public static void main(String[] args) {
		Lista p = new Lista();
		Lista s = new Lista();
		Lista t = new Lista();
		int []vp = {1,7};
		int []vs= {3,4,8};
		for(int valor : vp) {
			if(t.isEmpty()) {
			p.addFirst(valor);
			}else {
				try {
					p.addLast(valor);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		for( int d: vs) {
			if(s.isEmpty()) {
				s.addFirst(d);
			}else {
			try {
				s.addLast(d);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
			for( int i=0;i<p.size();i++) {
			if(t.isEmpty()) {
				try {
					t.addFirst(p.get(i));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				try {
					t.addLast(p.get(i));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
			for(int i=0;i<s.size();i++) {
				try {
					t.addLast(s.get(i));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for(int i=0;i<t.size();i++) {
				try {
					System.out.print(" "+ t.get(i));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
			System.out.println(" ");
		//ordenação
		for (int i=0; i<t.size();i++) {
			for(int j=(i+1);j<(t.size());j++) {
			
					try {
						
						if(t.get(i)>t.get(j)) {
							int aux =t.get(i);
							t.add(t.get(j), i+1);
							t.remova(i);
							t.add(aux,j+1);
							t.remova(j);
						}
					} catch (Exception e) {
					e.printStackTrace();
					}
				}
			}
		
		for(int i=0;i<t.size();i++) {
			try {
				System.out.print(" "+ t.get(i));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
